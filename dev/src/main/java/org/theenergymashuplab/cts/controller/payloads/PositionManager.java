/*
 * 
 * Updated by: Dhruvin Desai
 * 
 */

package org.theenergymashuplab.cts.controller.payloads;

import java.time.Instant;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.theenergymashuplab.cts.dao.PositionService;
import org.theenergymashuplab.cts.model.PositionManagerModel;


@RestController
@RequestMapping("/position")
public class PositionManager {
	private static final Logger logger = LogManager.getLogger(PositionManager.class);
	
	@Autowired
	PositionService posDao;
	
	@PostMapping("/position/{positionParty}/add")
	public PositionManagerModel createPosition(
			@PathVariable(value = "positionParty") int positionParty,
			@RequestBody long quantity
			//@RequestBody Interval interval
			) {
		
		// Creating temporary position manager model instance.
		PositionManagerModel posadd = new PositionManagerModel();
		
		// Populating Data into the model object.
		posadd.setPositionParty(positionParty);
		posadd.setQuantity(quantity);
		
		logger.info(posadd.toString());
		return posDao.save(posadd);
	}
	
	@GetMapping("/test1")
	public ResponseEntity<Object> getPositionforDuration() {
		long positionParty = 123;
		Instant sTime = Instant.parse("2020-04-30T15:00:00.00Z");
		long duration = 3600000;

		List<PositionManagerModel>  list =  posDao.getPositionforDuration(positionParty, sTime, duration);
		if (list == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/testadd/{count}")
	public PositionManagerModel createTestPosition(@PathVariable(value = "count") int count) {
		PositionManagerModel pos = new PositionManagerModel();
		Instant sTime = null;
		long duration = 0;
		
		switch(count) {
		case 1:
			// entry 1
			duration = 3600000;
			sTime = Instant.parse("2020-04-30T13:00:00.00Z");
			pos.setPositionParty(123);
			pos.setTransactionId(456);
			pos.setStartTime(sTime);
			pos.setExpireTime(sTime.plusMillis(duration));
			pos.setQuantity(10);
		break;
		
		case 2:
			// entry 1
			duration = 3600000;
			sTime = Instant.parse("2020-04-30T14:30:00.00Z");
			pos.setPositionParty(123);
			pos.setTransactionId(456);
			pos.setStartTime(sTime);
			pos.setExpireTime(sTime.plusMillis(duration));
			pos.setQuantity(20);
		break;
		
		case 3:
			// entry 1
			duration = 3600000;
			sTime = Instant.parse("2020-04-30T15:00:00.00Z");
			pos.setPositionParty(123);
			pos.setTransactionId(456);
			pos.setStartTime(sTime);
			pos.setExpireTime(sTime.plusMillis(duration));
			pos.setQuantity(30);
		break;
		
		case 4:
			// entry 1
			duration = 3600000;
			sTime = Instant.parse("2020-04-30T15:30:00.00Z");
			pos.setPositionParty(123);
			pos.setTransactionId(456);
			pos.setStartTime(sTime);
			pos.setExpireTime(sTime.plusMillis(duration));
			pos.setQuantity(40);
		break;
		
		case 5:
			// entry 1
			duration = 3600000;
			sTime = Instant.parse("2020-04-30T17:00:00.00Z");
			pos.setPositionParty(123);
			pos.setTransactionId(456);
			pos.setStartTime(sTime);
			pos.setExpireTime(sTime.plusMillis(duration));
			pos.setQuantity(50);
		break;
		
		case 6:
			// entry 1
			duration = 18000000;
			sTime = Instant.parse("2020-04-30T13:00:00.00Z");
			pos.setPositionParty(123);
			pos.setTransactionId(456);
			pos.setStartTime(sTime);
			pos.setExpireTime(sTime.plusMillis(duration));
			pos.setQuantity(60);
		break;
		
		default:
			
		break;
		}
		
		
		return posDao.save(pos);
	}
}
