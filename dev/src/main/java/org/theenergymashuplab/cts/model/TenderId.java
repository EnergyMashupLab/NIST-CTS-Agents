package org.theenergymashuplab.cts.model;

import java.util.concurrent.atomic.AtomicLong;

public class TenderId {
    private long myTenderId = 0;
    private static final AtomicLong tenderIdCounter = new AtomicLong();
    
    public TenderId(long tenderId){
        myTenderId = tenderIdCounter.addAndGet(tenderId);
    }
    
    public TenderId(){
        myTenderId = tenderIdCounter.incrementAndGet();
    }
    
    public long value()    {
        return this.myTenderId;
    }
}
