package org.theenergymashuplab.cts.controller.payloads;

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
	
	@PostMapping("/add")
	public PositionManagerModel createPosition(@Valid @RequestBody PositionManagerModel pos) {
		logger.info(pos.toString());
		return posDao.save(pos);
	}
	
	@GetMapping("/history/toId/{toId}")
	public ResponseEntity<Object> getPositionHistoryToId(@PathVariable(value = "toId") long toId) {
		List<PositionManagerModel>  list =  posDao.getHistoryToId(toId);
		if (list == null) {
			return ResponseEntity.notFound().build();
		}
		logger.info(String.valueOf(toId));
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/history/fromId/{fromId}")
	public ResponseEntity<Object> getPositionHistoryFromId(@PathVariable(value = "fromId") long fromId) {
		List<PositionManagerModel>  list =  posDao.getHistoryToId(fromId);
		if (list == null) {
			return ResponseEntity.notFound().build();
		}
		logger.info(String.valueOf(fromId));
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/history/count/{count}")
	public ResponseEntity<Object> getPositionHistory(@PathVariable(value = "count") int count) {
		List<PositionManagerModel>  list =  posDao.getHistory(count);
		if (list == null) {
			return ResponseEntity.notFound().build();
		}
		logger.info(String.valueOf(count));
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/getStatus/{id}")
	public String getStatus(@PathVariable(value = "id") long id) {
		PositionManagerModel p =  posDao.getStatus(id);
		return p.getStatus();
	}
	
}
