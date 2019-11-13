package XSD-01.EiPayloads;

import XSD-01.EIClasses.subscriberPartyID;
import XSD-01.EIClasses.publisherPartyID;
import XSD-01.EIClasses.quoteID;

/**
 * Used to cancel a Quote or Quotes.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:38 PM
 */
public class EiCancelQuoteType {

	public subscriberPartyID ext_ref_11;
	public publisherPartyID ext_ref_12;
	public quoteID ext_ref_13;
	public requestID ref_element10;

	public EiCancelQuoteType(){

	}

	public void finalize() throws Throwable {

	}

}