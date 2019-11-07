package com.eml.energy.controller.payloads;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.Where;
import org.hibernate.hql.internal.ast.tree.UpdateStatement;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
@RequestMapping("/canTen")
//public class EiCreateTenderType {
public class EiCancelTender {
	private static final Logger logger = LogManager.getLogger(EiCreateTransactionType.class);
	
	/*
	 * public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	 */
		
	@Autowired
	EiTenderType res;
	
	/*
	 * @RequestMapping("/") public String home(){ return "Hello World!"; }
	 */
	
	/*1) To cancel a tender*/
	@PostMapping("/add")
	
	public EiTenderModel createTender(@Valid @RequestBody EiTenderModel bks) {
	logger.info(bks.toString());
		return res.save(bks);
	}

	/* /* 2) Get cancelled tender by tender 
	@GetMapping("/search/{id}")
	public ResponseEntity<Object> getCreatedTender(@PathVariable(value = "id") Long tenderID) {
		Object bks =  tenderDao.findOne(tenderID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
logger.info(String.valueOf(tenderID));
		return ResponseEntity.ok().body(bks);
	}


	/* 3) delete a tender by tenderid 
    @DeleteMapping("/delete/{id}")
	//@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET  )
	public ResponseEntity <EiTenderModel> deleteBook(@PathVariable(value = "id") Long tenderID) {

    	EiTenderModel bks = (EiTenderModel) res.getOne(tenderID);
    
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
		if( bks.getStatus() == "cancelled")
		{
		logger.info(String.valueOf(tenderID));
		//EiTenderModel bks1 = bks;
		 res.delete( bks);

		return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

	/* 4) get all cancelledTenders 
    
	@GetMapping("/allTenders")
	public List<EiTenderModel> getAllTenders(){
		logger.info("All Tenders");
		return res.findAll();
	}

	public void finalize() throws Throwable {

	}
	*/

}