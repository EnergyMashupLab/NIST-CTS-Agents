package com.eml.energy.controller.payloads;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eml.energy.dao.*;
import com.eml.energy.model.*;

import java.util.List;
import java.util.Optional;

//package XSD-01.EiPayloads;

/*import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;
*/

@RestController
@RequestMapping("/transaction")
//public class EiCreateTenderType {
public class EiCancelTender {
	private static final Logger logger = LogManager.getLogger(EiCreateTransactionType.class);
	
	/*
	 * public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	 */
		
	@Autowired
	EiResponseType res;
	
	/*
	 * @RequestMapping("/") public String home(){ return "Hello World!"; }
	 */
	
	/*1) To cancel a tender*/
	@PostMapping("/add")
	public EiResponseModel cancelTender(@Valid @RequestBody EiResponseModel bks) {
		logger.info(bks.toString());
		return res.save(bks);
	}
	

	/*2) Get cancelled tender */
	@GetMapping("/search/{id}")
	@Where (clause= "responsecode = 'canceled'")
	public ResponseEntity <EiResponseModel>  getCancelledTender(@PathVariable(value="id") Long refID)
	{	
		logger.info("Search: "+refID);
		EiResponseModel bks = res.findOne(refID);
		
		if(bks == null) {
			logger.info("Reponse: null");
			return ResponseEntity.notFound().build();
		}
		logger.info("Reponse: "+bks.toString());
		return ResponseEntity.ok().body(bks);
	}
	

	public void finalize() throws Throwable {

	}

}