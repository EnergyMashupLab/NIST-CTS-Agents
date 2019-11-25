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
		ledger.trace("Inside Add: "+bks.toString());
		Ledger led = new Ledger();
		led.setParameters("Inside Add: "+bks.toString());
		ledgerDao.save(led);
		return responseDao.save(bks);
	}	

	/*2) Get created transaction by ID */
	@GetMapping("/search/{id}")
	public ResponseEntity<Object>  getCreatedTransaction(@PathVariable(value="id") Long refID){
		ledger.trace("Inside Search with  id: "+refID);
		Ledger led = new Ledger();
		led.setParameters("Inside Search with  id: "+refID);
		ledgerDao.save(led);
		Object bks = responseDao.findOne(refID);
		if(bks == null) {
			ledger.trace("Response: NULL");
			return ResponseEntity.notFound().build();
		}
		ledger.trace("Response: "+bks.toString());
		return ResponseEntity.ok().body(bks);
	}


	/*3) delete a transaction by refID */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EiResponseModel> deleteTransaction(@PathVariable(value = "id") Long refID) {
		ledger.trace("Inside  Delete: "+refID);
		Ledger led = new Ledger();
		led.setParameters("Inside  Delete: "+refID);
		ledgerDao.save(led);
		EiResponseModel bks = responseDao.getOne(refID);
		if(bks == null) {
			ledger.trace("Delete Response: NULL");
			return ResponseEntity.notFound().build();
		}
		ledger.trace("Delete Response: "+bks.toString());
		responseDao.delete(bks);
		return ResponseEntity.ok().build();		
	}

	/*4) get all Transactions*/
	@GetMapping("/allTransactions")
	public List<EiResponseModel> getAllTenders(){
		ledger.trace("Inside FindAll Transactions");
		Ledger led = new Ledger();
		led.setParameters("Inside FindAll Transactions");
		ledgerDao.save(led);
		return responseDao.findAll();
	}

	public void finalize() throws Throwable {

	}

}