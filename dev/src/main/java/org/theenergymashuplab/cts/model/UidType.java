package org.theenergymashuplab.cts.model;

import java.util.concurrent.atomic.AtomicLong;

public class UidType {

//	Long getUid() {
//		return UUID.randomUUID().toString();
//	}

	private long myUidId = 0;
	private static final AtomicLong uidIdCounter = new AtomicLong();

	UidType(long uidId){
		myUidId = uidIdCounter.addAndGet(uidId);
	    }

	UidType(){
		myUidId = uidIdCounter.incrementAndGet();
	    }

	public long value() {
		return this.myUidId;
	}
//	public static void main(String args[]) {
//		System.out.println(getUid());
//	}

}
