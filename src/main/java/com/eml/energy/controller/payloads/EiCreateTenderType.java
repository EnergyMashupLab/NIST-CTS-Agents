/**
 * Used to create and send a Tender.
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019 05:52:52 PM
 */

package com.eml.energy.controller.payloads;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//package XSD-01.EiPayloads;

/*import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;
*/

@RestController
@RequestMapping("/createTender")
//public class EiCreateTenderType {
public class EiCreateTenderType {

	/*
	 * public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	 */
	
	private int iddd;
	public EiCreateTenderType(){
		this.iddd = 111;
	}

	public void finalize() throws Throwable {

	}

}