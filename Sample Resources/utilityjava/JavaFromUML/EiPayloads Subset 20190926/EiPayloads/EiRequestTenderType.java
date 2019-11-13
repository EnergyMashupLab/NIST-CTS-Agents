package XSD-01.EiPayloads;

import XSD-01.EIClasses.actorID;
import XSD-01.Emix.MarketContextType;
import XSD-01.EIClasses.refID;
import XSD-01.Ws-calendar-streams-v1.0.ArrayofStreamIntervals;

/**
 * Used to Request outstanding Tenders.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:42 PM
 */
public class EiRequestTenderType {

	public actorID counterPartyID;
	/**
	 * Shoudl this be EiMarketContextType?
	 */
	public MarketContextType marketContext;
	public actorID partyID;
	public refID requestID;
	public actorID requestorPartyID;
	/**
	 * If present, limits range of request to tender made for products that occur
	 * within Interval.
	 */
	public ArrayofStreamIntervals streamIntervals;
	public refID tenderID;

	public EiRequestTenderType(){

	}

	public void finalize() throws Throwable {

	}

}