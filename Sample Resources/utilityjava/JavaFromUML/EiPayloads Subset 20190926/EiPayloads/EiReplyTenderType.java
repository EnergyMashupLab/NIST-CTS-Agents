package XSD-01.EiPayloads;

import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.ArrayofResponses;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:41 PM
 */
public class EiReplyTenderType {

	public EiResponseType eiResponse;
	public EiTenderType eiTender;
	public ArrayofResponses responses;

	public EiReplyTenderType(){

	}

	public void finalize() throws Throwable {

	}

}