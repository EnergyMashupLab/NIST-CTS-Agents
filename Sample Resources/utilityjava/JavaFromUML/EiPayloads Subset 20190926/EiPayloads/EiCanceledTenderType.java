package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.ArrayofResponses;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:37 PM
 */
public class EiCanceledTenderType {

	public actorID counterPartyID;
	public EiResponseType eiResponse;
	public actorID partyID;
	public ArrayofResponses responses;

	public EiCanceledTenderType(){

	}

	public void finalize() throws Throwable {

	}

}