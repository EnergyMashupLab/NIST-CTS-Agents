package org.theenergymashuplab.cts.model;

import java.util.UUID;

public interface UidType {
	
	default String getUid() {
		return UUID.randomUUID().toString();
	}
//	public static void main(String args[]) {
//		System.out.println(getUid());
//	}
}
