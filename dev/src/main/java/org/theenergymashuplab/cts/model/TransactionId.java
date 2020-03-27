/**
 * 
 */
package org.theenergymashuplab.cts.model;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Dhruvin
 *
 */
public class TransactionId {

	/**
	 * 
	 */
	private long transId = 0;
	private static final AtomicLong transactionIdCounter = new AtomicLong();

	public TransactionId(long transId){
		this.transId = transactionIdCounter.addAndGet(transId);
	    }

	public TransactionId(){
		transId = transactionIdCounter.incrementAndGet();
	    }

	public long value() {
		return this.transId;
	}

}
