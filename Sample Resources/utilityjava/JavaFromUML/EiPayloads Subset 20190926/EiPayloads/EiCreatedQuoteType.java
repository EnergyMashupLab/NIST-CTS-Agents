package XSD-01.EiPayloads;

import XSD-01.EIClasses.eiResponse;
import XSD-01.EIClasses.responses;
import XSD-01.EIClasses.subscriberPartyID;
import XSD-01.EIClasses.publisherPartyID;
import XSD-01.EIClasses.quoteID;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:38 PM
 */
public class EiCreatedQuoteType {

	public eiResponse ext_ref_5;
	public responses ext_ref_6;
	public subscriberPartyID ext_ref_7;
	public publisherPartyID ext_ref_8;
	/**
	 * If present, the response is limited to the quote[s] with respect to the
	 * counterparty with these IDs.
	 */
	public quoteID ext_ref_9;

	public EiCreatedQuoteType(){

	}

	public void finalize() throws Throwable {

	}

}