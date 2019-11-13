package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;

/**
 * Used to create and send a Tender.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:39 PM
 */
public class EiCreateTenderType {

	public actorID counterPartyID;
	public EiTenderType eiTender;
	public actorID partyID;
	public refID requestID;

	public EiCreateTenderType(){

	}

	public void finalize() throws Throwable {

	}

}