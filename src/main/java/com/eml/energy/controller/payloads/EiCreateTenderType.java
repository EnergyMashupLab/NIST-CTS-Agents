/**
 * Used to create and send a Tender.
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019 05:52:52 PM
 */

package com.eml.energy.controller.payloads;

import javax.validation.Valid;

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

import com.eml.energy.dao.EiTenderType;
import com.eml.energy.model.EiTenderModel;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//package XSD-01.EiPayloads;

/*import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;
*/

@RestController
@RequestMapping("/tenders")
//public class EiCreateTenderType {
public class EiCreateTenderType {
	private static final Logger logger = LogManager.getLogger(EiCreateTenderType.class);
	/*
	 * public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	 */

	@Autowired
	EiTenderType tenderDao;
	@RequestMapping("/")
	public String home(){ 
		return "Hello World!"; 
	}
	
	 	
	/*1) To Save an tender*/

	@PostMapping("/add")
	public EiTenderModel createTender(@Valid @RequestBody EiTenderModel bks) {
		logger.info(bks.toString());
		return tenderDao.save(bks);
	}

	/* 2) Get created tender */
	@GetMapping("/search/{id}")
	public ResponseEntity<EiTenderModel> getCreatedTender(@PathVariable(value = "id") Long tenderID) {
		EiTenderModel bks = tenderDao.findOne(tenderID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
		logger.info(String.valueOf(tenderID));
		return ResponseEntity.ok().body(bks);
	}

	/* 3) delete a tender by tenderid */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EiTenderModel> deleteBook(@PathVariable(value = "id") Long tenderID) {

		EiTenderModel bks = tenderDao.findOne(tenderID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
		logger.info(String.valueOf(tenderID));
		tenderDao.delete(bks);

		return ResponseEntity.ok().build();
	}

	/* 4) get all Tenders */
	@GetMapping("/allTenders")
	public List<EiTenderModel> getAllTenders(){
		logger.info("All Tenders");
		return tenderDao.findAll();
	}

	/* Default methods */
	int test;

	public EiCreateTenderType() {
		this.test = 11;
	}

	public void finalize() throws Throwable {

	}

}