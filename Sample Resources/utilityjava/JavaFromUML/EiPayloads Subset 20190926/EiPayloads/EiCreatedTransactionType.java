package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.ArrayofResponses;
import XSD-01.EIClasses.refID;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:39 PM
 */
public class EiCreatedTransactionType {

	public actorID counterPartyID;
	public EiResponseType eiResponse;
	public actorID partyID;
	public ArrayofResponses responses;
	public refID transactionID;

	public EiCreatedTransactionType(){

	}

	public void finalize() throws Throwable {

	}

}