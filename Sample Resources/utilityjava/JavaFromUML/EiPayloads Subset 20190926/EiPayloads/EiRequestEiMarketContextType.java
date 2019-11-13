package XSD-01.EiPayloads;

import XSD-01.Emix.MarketContextType;
import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.refID;

/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:41 PM
 */
public class EiRequestEiMarketContextType {

	/**
	 * This is Emix:MarketContextType
	 */
	public MarketContextType marketConrtext;
	public actorID partyID;
	public refID requestID;

	public EiRequestEiMarketContextType(){

	}

	public void finalize() throws Throwable {

	}

}