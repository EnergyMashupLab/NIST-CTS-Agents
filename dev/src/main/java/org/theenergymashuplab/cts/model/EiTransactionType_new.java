/**
 * @author Dhruvin
 *
 */
package org.theenergymashuplab.cts.model;

public class EiTransactionType_new extends EiTenderType_new{

	/**
	 * 
	 */
	
	// TransactionIDType transactionID;
	long transactionID;
	
	// Constructor with only passing tender object.
	public EiTransactionType_new(EiTenderType_new tenderObj) {
		// Constructor body begin.
		
		// Auto-Generating transctionID.
		TransactionId tempid = new TransactionId();
		this.transactionID = tempid.value();
		
		// Setting Tender.
		this.setTenderID(tenderObj.getTenderID());
		this.setDuration(tenderObj.getDuration());
		this.setExpireTime(tenderObj.getExpireTime());
		this.setQuantity(tenderObj.getQuantity());
		this.setStartTime(tenderObj.getStartTime());
		this.setTransactiveState(tenderObj.getTransactiveState());
	}
	
	// Constructor with transactionID and tender passed to it.
	public EiTransactionType_new(long transactionID, EiTenderType_new tenderObj) {
		// Constructor body begin.
		this.transactionID = transactionID;
		
		// Setting Tender.
		this.setTenderID(tenderObj.getTenderID());
		this.setDuration(tenderObj.getDuration());
		this.setExpireTime(tenderObj.getExpireTime());
		this.setQuantity(tenderObj.getQuantity());
		this.setStartTime(tenderObj.getStartTime());
		this.setTransactiveState(tenderObj.getTransactiveState());
	}

}
