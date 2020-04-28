/*
 * 
 * Updated by: Dhruvin Desai
 * 
 */


package org.theenergymashuplab.cts.repository;

import java.time.Instant;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.theenergymashuplab.cts.model.PositionManagerModel;

public interface PositionRepository extends JpaRepository<PositionManagerModel, Long>{
	
	@Query(nativeQuery = true, value = "select * from Position p order by p.timestamp desc limit :count")
	public List<PositionManagerModel> getHistory(@Param("count") int count);
	
	@Query(nativeQuery = true, value = "select * from Position p where p.Position_id=:id")
	public PositionManagerModel getStatus(@Param("id") long id);
	
	@Query(nativeQuery = true, value = "select * from Position p where p.to_id=:toId")
	public List<PositionManagerModel> getHistoryToId(@Param("toId") long toId);
	
	@Query(nativeQuery = true, value = "select * from Position p where p.from_id=:fromId")
	public List<PositionManagerModel> getHistoryFromId(@Param("fromId") long fromId);
	
	// New updated queries.
	@Query(nativeQuery = true, value = "select * from Position p where (p.position_party = :positionParty) AND ((p.start_time <= :sTime AND p.end_time > :sTime) OR (p.start_time < :sTime_plus_dur AND p.start_time > :sTime))")
	public List<PositionManagerModel> getPositionforDuration(@Param("positionParty") long positionParty,
			@Param("sTime") Instant sTime,
			@Param("sTime_plus_dur") Instant sTime_plus_dur);
	
}
