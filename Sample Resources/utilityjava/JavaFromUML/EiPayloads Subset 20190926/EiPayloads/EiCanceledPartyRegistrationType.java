package XSD-01.EiPayloads;

import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.ArrayofResponses;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:37 PM
 */
public class EiCanceledPartyRegistrationType {

	public EiResponseType eiResponse;
	public actorID registrarPartyID;
	public actorID registreePartyID;
	public actorID respondingPartyID;
	public ArrayofResponses responses;

	public EiCanceledPartyRegistrationType(){

	}

	public void finalize() throws Throwable {

	}

}