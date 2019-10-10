package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTransactionType;
import XSD-01.EIClasses.refID;

/**
 * Used to create and send a Transaction.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:39 PM
 */
public class EiCreateTransactionType {

	public actorID counterPartyID;
	public EiTransactionType eiTransaction;
	public actorID partyID;
	public refID requestID;

	public EiCreateTransactionType(){

	}

	public void finalize() throws Throwable {

	}

}