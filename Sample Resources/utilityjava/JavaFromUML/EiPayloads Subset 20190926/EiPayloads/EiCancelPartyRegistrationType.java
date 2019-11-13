package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.refID;

/**
 * Used to cancel one or more Party Registrations.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:38 PM
 */
public class EiCancelPartyRegistrationType {

	public actorID registrarPartyID;
	public refID registrationID;
	public actorID registreePartyID;
	public refID requestID;

	public EiCancelPartyRegistrationType(){

	}

	public void finalize() throws Throwable {

	}

}