package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.refID;
import XSD-01.Ws-calendar-streams-v1.0.ArrayofStreamIntervals;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:41 PM
 */
public class EiRequestPartyRegistrationType {

	public actorID registrarPartyID;
	public refID registrationID;
	public actorID registreePartyID;
	public refID requestID;
	public actorID requestorPartyID;
	/**
	 * If present, limits range of request to registrations within Interval.
	 */
	public ArrayofStreamIntervals streamIntervals;

	public EiRequestPartyRegistrationType(){

	}

	public void finalize() throws Throwable {

	}

}