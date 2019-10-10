package XSD-01.EiPayloads;

import XSD-01.EIClasses.publisherPartyID;
import XSD-01.EIClasses.subscriberPartyID;
import XSD-01.EIClasses.eiQuote;

/**
 * Used to create and send a Quote.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:39 PM
 */
public class EiCreateQuoteType {

	public publisherPartyID ext_ref_2;
	public subscriberPartyID ext_ref_3;
	public eiQuote ext_ref_4;
	public requestID ref_element1;

	public EiCreateQuoteType(){

	}

	public void finalize() throws Throwable {

	}

}