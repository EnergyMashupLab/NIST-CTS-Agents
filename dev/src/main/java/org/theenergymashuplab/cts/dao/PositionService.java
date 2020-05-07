/*
 * 
 * Updated by: Dhruvin Desai
 * 
 */

package org.theenergymashuplab.cts.dao;

import java.time.Instant;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.theenergymashuplab.cts.model.PositionManagerModel;
import org.theenergymashuplab.cts.repository.PositionRepository;

@Service
public class PositionService {
	
	@Autowired
	PositionRepository posRepo;
	
	public PositionManagerModel save(@Valid PositionManagerModel pos) {
		return posRepo.save(pos);
	}
	
	public PositionManagerModel getStatus(long id){
		return posRepo.getStatus(id);
	}
	
	public List<PositionManagerModel> getPositionforDuration(long positionParty, Instant sTime, long duration) {
		return posRepo.getPositionforDuration(positionParty, sTime, sTime.plusMillis(duration));
	}
	
	
}
