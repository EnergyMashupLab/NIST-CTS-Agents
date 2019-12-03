package org.theenergymashuplab.cts.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Position")
public class PositionManagerModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Position_id")
	private long positionId;
	
	@Column(name = "Tender_id")
	private long tenderID;
	
	@Column(name = "Transaction_id")
	private long transactionID;
	
	@Column(name = "Party_id")
	private long partyID;
	
	@Column(name = "CounterParty_id")
	private long counterPartyID;
	
	@Column(name = "Status")
	private String status;
	
	@Column(name = "Units")
	private long units;
	
	@Column(name = "To_id")
	private long toId;
	
	@Column(name = "From_id")
	private long fromId;
	
	private Date timestamp;

	public long getPositionId() {
		return positionId;
	}

	public void setPositionId(long positionId) {
		this.positionId = positionId;
	}

	public long getTenderID() {
		return tenderID;
	}

	public void setTenderID(long tenderID) {
		this.tenderID = tenderID;
	}

	public long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}

	public long getPartyID() {
		return partyID;
	}

	public void setPartyID(long partyID) {
		this.partyID = partyID;
	}

	public long getCounterPartyID() {
		return counterPartyID;
	}

	public void setCounterPartyID(long counterPartyID) {
		this.counterPartyID = counterPartyID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getUnits() {
		return units;
	}

	public void setUnits(long units) {
		this.units = units;
	}

	public long getToId() {
		return toId;
	}

	public void setToId(long toId) {
		this.toId = toId;
	}

	public long getFromId() {
		return fromId;
	}

	public void setFromId(long fromId) {
		this.fromId = fromId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Timestamp")
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}	
}
