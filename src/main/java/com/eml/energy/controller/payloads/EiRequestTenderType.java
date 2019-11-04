/**
 * Used to create and send a Tender.
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019 05:52:52 PM
 */

package com.eml.energy.controller.payloads;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eml.energy.dao.EiRequestTender;
import com.eml.energy.model.EiRequestTenderModel;
import com.eml.energy.model.EiTenderModel;

import java.util.List;

//package XSD-01.EiPayloads;

/*import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;
*/

@RestController
@RequestMapping("/reqtend")
public class EiRequestTenderType {
	private static final Logger logger = LogManager.getLogger(EiCreateTenderType.class);
	/*
	 * public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	 */
		
	@Autowired
	EiRequestTender reqTendDao;
	
	/*
	 * @RequestMapping("/") public String home(){ return "Hello World!"; }
	 */
	@RequestMapping("/") 
	public String homes(){ return "Hello World! In request Tender"; }

	@PostMapping("/add")
	public EiRequestTenderModel createTender(@Valid @RequestBody EiRequestTenderModel bks) {
		return reqTendDao.save(bks);
	}
	
	/* 2) Get created tender */
	@GetMapping("/search/{id}")
	
	public ResponseEntity<Object> getCreatedTender(@PathVariable(value = "id") Long requestID) {
		Object bks =  reqTendDao.findOne(requestID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
      logger.info(String.valueOf(requestID));
		return ResponseEntity.ok().body(bks);
	}

	/* 3) delete a tender by tenderid */
    @DeleteMapping("/delete/{id}")
	
	public ResponseEntity <EiTenderModel> deleteBook(@PathVariable(value = "id") Long requestID) {

    	EiRequestTenderModel bks = (EiRequestTenderModel) reqTendDao.getOne(requestID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
		logger.info(String.valueOf(requestID));
		//EiTenderModel bks1 = bks;
		reqTendDao.delete( bks);

		return ResponseEntity.ok().build();
	}

	/* 4) get all Tenders */
	@GetMapping("/allTenders")
	public List<EiRequestTenderModel> getAllTenders(){
		logger.info("All Tenders");
		return reqTendDao.findAll();
	}
}
