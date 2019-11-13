package XSD-01.EiPayloads;

import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.refID;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:38 PM
 */
public class EiCreatedPartyRegistrationType {

	public EiResponseType eiResponse;
	public actorID registrarPartyID;
	public refID registrationID;
	public actorID registreePartyID;

	public EiCreatedPartyRegistrationType(){

	}

	public void finalize() throws Throwable {

	}

}