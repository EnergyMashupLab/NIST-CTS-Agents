/*
 * 
 * Updated by: Dhruvin Desai
 * 
 */

package org.theenergymashuplab.cts.controller.payloads;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
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
//	@RequestMapping("/position")
public class PositionManager {
	private static final Logger logger = LogManager.getLogger(PositionManager.class);

	@Autowired
	PositionService posDao;

	@PostMapping("/position/{positionParty}/add")
	// add to a position
	public String createPosition(@PathVariable(value = "positionParty") long positionParty,
			@RequestBody PositionAddPayload posPayload, HttpServletResponse response) {

		// Creating temporary position manager model instance.
		PositionManagerModel posadd = new PositionManagerModel(
				positionParty,
				0,
				posPayload.getQuantity(),
				posPayload.getInterval().getDtStart(),
				posPayload.getInterval().getDuration().getSeconds());

		List<PositionManagerModel> queryresult = posDao.getPositionforUpdate(
				positionParty,
				posPayload.getInterval().getDtStart(),
				posPayload.getInterval().getDuration().getSeconds());
		
		logger.info(posadd.toString());
		
		if (queryresult.isEmpty()) {
			// New row to be added.
			// Saving the position.
			PositionManagerModel temp = null;
			temp = posDao.save(posadd);

			// Return output decider.
			if (temp != null) {
				response.setStatus(HttpServletResponse.SC_OK);
				return "OK";
			} else {
				response.setStatus(HttpServletResponse.SC_ACCEPTED);
				return "ERROR: Not able to store the data.";
			}
		} else {
			// Updating existing row.
			// Saving the position.
			int temp = 0;
			temp = posDao.updatePositionforDuration(
					positionParty,
					posPayload.getInterval().getDtStart(),
					posPayload.getInterval().getDuration().getSeconds(),
					posPayload.getQuantity());

			// Return output decider.
			if (temp == 1) {
				response.setStatus(HttpServletResponse.SC_OK);
				return "OK";
			} 
			else if(temp > 1) {
				response.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
				return "Multiple Rows affected.";
			}
			else {
				response.setStatus(HttpServletResponse.SC_ACCEPTED);
				return "ERROR: Not able to store the data.";
			}
		}

	}

	@GetMapping("/position/{positionParty}/getPosition")
	public ArrayList<PositionGetPayload> getPosition(@PathVariable(value = "positionParty") long positionParty,
			@RequestBody Interval interval) {
		ArrayList<PositionGetPayload> dataList = new ArrayList<PositionGetPayload>();

		// Querying for data.
		List<PositionManagerModel> queryresult = posDao.getPositionforDuration(positionParty, interval.getDtStart(),
				interval.getDuration().getSeconds());

		// Generating response list.
		PositionGetPayload tpayload = null;
		Interval tinterval = null;

		for (PositionManagerModel tposmod : queryresult) {
			tinterval = new Interval(Duration.between(tposmod.getStartTime(), tposmod.getEndTime()).toMinutes(),
					tposmod.getStartTime());
			tpayload = new PositionGetPayload(tinterval, tposmod.getQuantity());

			// Adding to the dataList.
			dataList.add(tpayload);
		}
		return dataList;
	}

	/*
	 * GET method /position/{positionParty}/getPosition
	 *
	 * GET on this URI returns the position value for positionparty in the interval
	 * passed
	 *
	 * @RequestBody has boundingInterval (in the granularity of the market - one
	 * hour market it's an interval starting on an hour
	 *
	 * Turn the interval into start end time
	 *
	 * OK to have one interval and the return is a long
	 * 
	 * Future - boundingInterval
	 */

// position for that interval - if 3 or 4
	/*
	 * if UA asks for position bounding interval
	 * 
	 * RETURN A LIST <Interval, quantity> each of which fits in the boundingInterval
	 * 
	 * What do you do if no positions are there? check for empty at the caller - UA
	 * does the test of what's back
	 */

//	position/dumpPositions --print the whole database on the console (System.err)

	/*
	 * @GetMapping("/test1") public ResponseEntity<Object> getPositionforDuration()
	 * { long positionParty = 123; Instant sTime =
	 * Instant.parse("2020-04-30T15:00:00.00Z"); long duration = 3600000;
	 * 
	 * List<PositionManagerModel> list =
	 * posDao.getPositionforDuration(positionParty, sTime, duration); if (list ==
	 * null) { return ResponseEntity.notFound().build(); } return
	 * ResponseEntity.ok().body(list); }
	 * 
	 * @GetMapping("/testadd/{count}") public PositionManagerModel
	 * createTestPosition(@PathVariable(value = "count") int count) {
	 * PositionManagerModel pos = new PositionManagerModel(); Instant sTime = null;
	 * long duration = 0;
	 * 
	 * switch(count) { case 1: // entry 1 duration = 3600000; sTime =
	 * Instant.parse("2020-04-30T13:00:00.00Z"); pos.setPositionParty(123);
	 * pos.setTransactionId(456); pos.setStartTime(sTime);
	 * pos.setEndTime(sTime.plusMillis(duration)); pos.setQuantity(10); break;
	 * 
	 * case 2: // entry 1 duration = 3600000; sTime =
	 * Instant.parse("2020-04-30T14:30:00.00Z"); pos.setPositionParty(123);
	 * pos.setTransactionId(456); pos.setStartTime(sTime);
	 * pos.setEndTime(sTime.plusMillis(duration)); pos.setQuantity(20); break;
	 * 
	 * case 3: // entry 1 duration = 3600000; sTime =
	 * Instant.parse("2020-04-30T15:00:00.00Z"); pos.setPositionParty(123);
	 * pos.setTransactionId(456); pos.setStartTime(sTime);
	 * pos.setEndTime(sTime.plusMillis(duration)); pos.setQuantity(30); break;
	 * 
	 * case 4: // entry 1 duration = 3600000; sTime =
	 * Instant.parse("2020-04-30T15:30:00.00Z"); pos.setPositionParty(123);
	 * pos.setTransactionId(456); pos.setStartTime(sTime);
	 * pos.setEndTime(sTime.plusMillis(duration)); pos.setQuantity(40); break;
	 * 
	 * case 5: // entry 1 duration = 3600000; sTime =
	 * Instant.parse("2020-04-30T17:00:00.00Z"); pos.setPositionParty(123);
	 * pos.setTransactionId(456); pos.setStartTime(sTime);
	 * pos.setEndTime(sTime.plusMillis(duration)); pos.setQuantity(50); break;
	 * 
	 * case 6: // entry 1 duration = 18000000; sTime =
	 * Instant.parse("2020-04-30T13:00:00.00Z"); pos.setPositionParty(123);
	 * pos.setTransactionId(456); pos.setStartTime(sTime);
	 * pos.setEndTime(sTime.plusMillis(duration)); pos.setQuantity(60); break;
	 * 
	 * default:
	 * 
	 * break; }
	 * 
	 * 
	 * return posDao.save(pos); }
	 */
}
