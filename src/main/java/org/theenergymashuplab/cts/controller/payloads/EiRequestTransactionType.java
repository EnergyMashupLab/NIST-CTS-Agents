/**
 * Used to create and send a Tender.
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019 05:52:52 PM
 */

package org.theenergymashuplab.cts.controller.payloads;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.theenergymashuplab.cts.dao.EiRequestTransaction;
import org.theenergymashuplab.cts.model.EiRequestTransactionModel;

import java.util.List;

//package XSD-01.EiPayloads;

/*import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;
*/

@RestController
@RequestMapping("/reqtrans")
public class EiRequestTransactionType {
	
	/*
	 * public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	 */
		
	@Autowired
	EiRequestTransaction reqTransDao;
	
	/*
	 * @RequestMapping("/") public String home(){ return "Hello World!"; }
	 */
	@RequestMapping("/") 
	public String homes(){ return "Hello World! In request Transaction"; }

	@PostMapping("/add")
	public EiRequestTransactionModel createRTransaction(@Valid @RequestBody EiRequestTransactionModel bks) {
		return reqTransDao.save(bks);
	}
	/* 2) Get requested tender */
	@GetMapping("/search/{id}")
	
	public ResponseEntity<Object> getCreatedTender(@PathVariable(value = "id") Long requestID) {
		Object bks =  reqTransDao.findOne(requestID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
     
		return ResponseEntity.ok().body(bks);
	}

	/* 3) delete a tender by requestID */
    @DeleteMapping("/delete/{id}")
	
	public ResponseEntity <EiRequestTransactionModel> deleteBook(@PathVariable(value = "id") Long requestID) {

    	EiRequestTransactionModel bks = (EiRequestTransactionModel) reqTransDao.getOne(requestID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
		
		
		reqTransDao.delete( bks);

		return ResponseEntity.ok().build();
	}

	/* 4) get all requested tenders */
	@GetMapping("/allTenders")
	public List<EiRequestTransactionModel> getAllTenders(){
		
		return reqTransDao.findAll();
	}
}
