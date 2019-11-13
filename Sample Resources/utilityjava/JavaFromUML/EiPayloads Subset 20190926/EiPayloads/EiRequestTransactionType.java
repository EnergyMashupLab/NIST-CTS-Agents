package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.Emix.MarketContextType;
import XSD-01.EIClasses.refID;
import XSD-01.Ws-calendar-streams-v1.0.ArrayofStreamIntervals;

/**
 * Request extant Transactions.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:42 PM
 */
public class EiRequestTransactionType {

	public actorID counterPartyID;
	/**
	 * Should this be EiMarketContext?
	 */
	public MarketContextType marketContext;
	public actorID partyID;
	public refID requestID;
	public actorID requestorPartyID;
	/**
	 * If present, limits range of request to transactions that occur within Interval.
	 */
	public ArrayofStreamIntervals streamIntervals;
	public refID transactionID;

	public EiRequestTransactionType(){

	}

	public void finalize() throws Throwable {

	}

}