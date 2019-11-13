package XSD-01.EiPayloads;

import XSD-01.EIClasses.refID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.actorID;

/**
 * Used for Broadcast of Tenders.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:39 PM
 */
public class EiDistributeTenderType {

	/**
	 * Target not valid. Delete, or keep with cardinality 0. If needed, changed to
	 * refID referencing a collection.
	 */
	public refID eiTarget;
	public EiTenderType eiTender;
	public actorID partyID;
	public refID requestID;

	public EiDistributeTenderType(){

	}

	public void finalize() throws Throwable {

	}

}