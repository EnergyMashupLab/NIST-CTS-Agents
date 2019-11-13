package org.theenergymashuplab.cts.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name="EiRequestTender")
@EntityListeners(AuditingEntityListener.class)
public class EiRequestTenderModel {
	@Id
	@NotNull
	private long requestID;	/*Primary key,  */
	@NotBlank
	private String emixMarketContext;
	@NotNull
	private long counterPartyID;
	private long partyID;
	private long requestorPartyID;
	private String streamIntervals;
	
	/*Getter and Setter */
	public long getRequestID() {
		return requestID;
	}
	public void setRequestID(long requestID) {
		this.requestID = requestID;
	}
	public String getEmixMarketContext() {
		return emixMarketContext;
	}
	public void setEmixMarketContext(String emixMarketContext) {
		this.emixMarketContext = emixMarketContext;
	}
	public long getCounterPartyID() {
		return counterPartyID;
	}
	public void setCounterPartyID(long counterPartyID) {
		this.counterPartyID = counterPartyID;
	}
	public long getPartyID() {
		return partyID;
	}
	public void setPartyID(long partyID) {
		this.partyID = partyID;
	}
	public long getRequestorPartyID() {
		return requestorPartyID;
	}
	public void setRequestorPartyID(long requestorPartyID) {
		this.requestorPartyID = requestorPartyID;
	}
	public String getStreamIntervals() {
		return streamIntervals;
	}
	public void setStreamIntervals(String streamIntervals) {
		this.streamIntervals = streamIntervals;
	}

}
