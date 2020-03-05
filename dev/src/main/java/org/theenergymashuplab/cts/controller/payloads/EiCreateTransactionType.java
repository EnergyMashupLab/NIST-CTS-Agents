package org.theenergymashuplab.cts.controller.payloads;

import javax.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.theenergymashuplab.cts.dao.*;
import org.theenergymashuplab.cts.model.*;
import java.util.List;

//package XSD-01.EiPayloads;

/*import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;
 */

@RestController
@RequestMapping("/transaction")
//public class EiCreateTenderType {
public class EiCreateTransactionType {
	//private static final Logger logger = LogManager.getLogger(EiCreateTransactionType.class);
	private static final Logger ledger = LogManager.getLogger(EiCreateTransactionType.class);//get ledger for this class
	
	// Application general logger for logging general logs.
	private static final Logger logger2 = LogManager.getLogger("application_general_logger");
	
	/*
	 * public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	 */

	@Autowired
	EiResponseType responseDao;

	@Autowired
	LedgerService ledgerDao;

	@RequestMapping("/") public String home(){ return "Hello World!"; }


	/*1) To Save a transaction*/
	@PostMapping("/add")
	public EiResponseModel createTransaction(@Valid @RequestBody EiResponseModel bks) {
		//ledger.info("Inside Add: "+bks.toString());
		String ledger_entry;		
		Ledger led = new Ledger();
		led.setParameters("Inside Add: "+bks.toString());
		
		// Generating ledger data file formatted entry.
		ledger_entry = led.getTransactionID() + "\t" + led.getTimestamp().toString() + "\t" + led.getTenderID() + "\t" + led.getPartyID() + "\t" + led.getCounterPartyID();
		ledgerDao.save(led);
		ledger.info(ledger_entry);
		return responseDao.save(bks);
	}	

	/*2) Get created transaction by ID */
	@GetMapping("/search/{id}")
	public ResponseEntity<Object>  getCreatedTransaction(@PathVariable(value="id") Long refID){
		logger2.info("Searching transaction with refID: "+refID);
		Ledger led = new Ledger();
		led.setParameters("Inside Search with  id: "+refID);
		ledgerDao.save(led);
		Object bks = responseDao.findOne(refID);
		if(bks == null) {
			logger2.trace("Response: NULL");
			return ResponseEntity.notFound().build();
		}
		logger2.trace("Response: "+bks.toString());
		return ResponseEntity.ok().body(bks);
	}


	/*3) delete a transaction by refID */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EiResponseModel> deleteTransaction(@PathVariable(value = "id") Long refID) {
		logger2.trace("Deleting transaction with refID: "+refID);
		Ledger led = new Ledger();
		led.setParameters("Inside  Delete: "+refID);
		ledgerDao.save(led);
		EiResponseModel bks = responseDao.getOne(refID);
		if(bks == null) {
			logger2.trace("Delete Response: NULL");
			return ResponseEntity.notFound().build();
		}
		logger2.trace("Delete Response: "+bks.toString());
		responseDao.delete(bks);
		return ResponseEntity.ok().build();		
	}

	/*4) get all Transactions*/
	@GetMapping("/allTransactions")
	public List<EiResponseModel> getAllTenders(){
		logger2.trace("All Transactions Requested.");
		Ledger led = new Ledger();
		led.setParameters("Inside FindAll Transactions");
		ledgerDao.save(led);
		return responseDao.findAll();
	}

	public void finalize() throws Throwable {

	}

}