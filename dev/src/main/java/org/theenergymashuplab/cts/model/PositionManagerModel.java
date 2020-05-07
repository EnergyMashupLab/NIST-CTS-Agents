/*
 * 
 * Updated by: Dhruvin Desai
 * 
 */

package org.theenergymashuplab.cts.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Position")
public class PositionManagerModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Counter_ID")
	private long counterId;
	
	@Column(name = "positionParty")
	private long positionParty;

	/**
	 * @return the counterId
	 */
	public long getCounterId() {
		return counterId;
	}

	/**
	 * @param counterId the counterId to set
	 */
	public void setCounterId(long counterId) {
		this.counterId = counterId;
	}

	@Column(name = "Transaction_id")
	private long transactionId ;
	
	@Column(name = "Quantity")
	private long quantity ;
	
	@Column(name = "Start_Time")
	@NotNull
	private Instant startTime;
	
	@Column(name = "End_Time")
	@NotNull
	private Instant expireTime;
	
	/*
	 * CHANGE to End time
	 */
	

	/**
	 * @return the startTime
	 */
	public Instant getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Instant startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the expireTime
	 */
	public Instant getExpireTime() {
		return expireTime;
	}

	/**
	 * @param expireTime the expireTime to set
	 */
	public void setExpireTime(Instant expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * @return the positionParty
	 */
	public long getPositionParty() {
		return positionParty;
	}

	/**
	 * @param positionParty the positionParty to set
	 */
	public void setPositionParty(long positionParty) {
		this.positionParty = positionParty;
	}

	/**
	 * @return the transactionId
	 */
	public long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the quantity
	 */
	public long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	/*
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Timestamp")
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}	
	*/
}
