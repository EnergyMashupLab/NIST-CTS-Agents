package XSD-01.EiPayloads;

import XSD-01.EIClasses.EiResponseType;
import XSD-01.EIClasses.EiTransactionType;
import XSD-01.EIClasses.ArrayofResponses;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:41 PM
 */
public class EiReplyTransactionType {

	public EiResponseType eiResponse;
	public EiTransactionType eiTransaction;
	public ArrayofResponses responses;

	public EiReplyTransactionType(){

	}

	public void finalize() throws Throwable {

	}

}