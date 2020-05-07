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

	@Query(nativeQuery = true, value = "select * from Position p where p.Position_id=:id")
	public PositionManagerModel getStatus(@Param("id") long id);
	
	// New updated queries.
	@Query(nativeQuery = true, value = "select * from Position p where (p.position_party = :positionParty) AND ((p.start_time <= :sTime AND p.end_time > :sTime) OR (p.start_time < :sTime_plus_dur AND p.start_time > :sTime))")
	public List<PositionManagerModel> getPositionforDuration(@Param("positionParty") long positionParty,
			@Param("sTime") Instant sTime,
			@Param("sTime_plus_dur") Instant sTime_plus_dur);
	
}
