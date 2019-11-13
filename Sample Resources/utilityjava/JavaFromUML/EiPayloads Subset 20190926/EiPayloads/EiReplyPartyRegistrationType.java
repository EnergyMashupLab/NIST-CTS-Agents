package XSD-01.EiPayloads;

import XSD-01.EIClasses.EiRegistrationType;
import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.ArrayofResponses;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:41 PM
 */
public class EiReplyPartyRegistrationType {

	public EiRegistrationType eiRegistration;
	public EiResponseType eiResponse;
	public ArrayofResponses responses;

	public EiReplyPartyRegistrationType(){

	}

	public void finalize() throws Throwable {

	}

}