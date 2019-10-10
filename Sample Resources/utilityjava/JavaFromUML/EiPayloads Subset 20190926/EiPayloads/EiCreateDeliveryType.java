package XSD-01.EiPayloads;

import XSD-01.Emix.DeliveryType;
import XSD-01.EIClasses.refID;
import XSD-01.EIClasses.actorID;

/**
 * Create Delivery passes 1 or more "empty" emix deliveries as a request to
 * receive each back with quantities filled in as eiDeliveries.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:38 PM
 */
public class EiCreateDeliveryType {

	public DeliveryType delivery;
	public refID requestID;
	public actorID requestorPartyID;

	public EiCreateDeliveryType(){

	}

	public void finalize() throws Throwable {

	}

}