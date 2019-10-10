package XSD-01.EiPayloads;

import XSD-01.Emix.DeliveryType;
import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.ArrayofResponses;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:38 PM
 */
public class EiCreatedDeliveryType {

	public DeliveryType eiDelivery;
	public EiResponseType eiResponse;
	public ArrayofResponses responses;

	public EiCreatedDeliveryType(){

	}

	public void finalize() throws Throwable {

	}

}