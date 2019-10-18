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
}
