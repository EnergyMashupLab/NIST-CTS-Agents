package XSD-01.EiPayloads;

import XSD-01.EIClasses.requestorPartyID;
import XSD-01.EIClasses.publisherPartyID;
import XSD-01.EIClasses.quoteID;

/**
 * Used to request outstanding Quotes.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:42 PM
 */
public class EiRequestQuoteType {

	public requestorPartyID ext_ref_19;
	public publisherPartyID ext_ref_20;
	public emix:marketContext ext_ref_21;
	public quoteID ext_ref_22;
	/**
	 * If present, limits range of request to Quotes for products that occur within
	 * Interval.
	 */
	public strm:intervals ext_ref_23;
	public requestID ref_element18;

	public EiRequestQuoteType(){

	}

	public void finalize() throws Throwable {

	}

}