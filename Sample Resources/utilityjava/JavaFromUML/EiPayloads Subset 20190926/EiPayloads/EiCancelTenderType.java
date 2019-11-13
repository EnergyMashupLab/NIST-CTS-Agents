package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.refID;

/**
 * Used to Cancel one or more Tenders.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:38 PM
 */
public class EiCancelTenderType {

	public actorID counterPartyID;
	public actorID partyID;
	public refID requestID;
	public refID tenderID;

	public EiCancelTenderType(){

	}

	public void finalize() throws Throwable {

	}

}