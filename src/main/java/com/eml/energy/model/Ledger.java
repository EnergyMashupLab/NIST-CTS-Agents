/**
 * @author Dhrumil Shah
 * @version 1.0
 * @created 11-Nov-2019
 */

package com.eml.energy.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Ledger")
public class Ledger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Ledger_id")
	private long ledgerID;
	
	@Column(name = "Tender_id")
	private long tenderID;
	
	@Column(name = "Transaction_id")
	private long transactionID;
	
	@Column(name = "Party_id")
	private long partyID;
	
	@Column(name = "CounterParty_id")
	private long counterPartyID;
	
	@Column(name = "Parameters")
	private String parameters;
	
	private Date timestamp;
		
	public long getLedgerID() {
		return ledgerID;
	}

	public void setLedgerID(long ledgerID) {
		this.ledgerID = ledgerID;
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
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Timestamp")
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
}