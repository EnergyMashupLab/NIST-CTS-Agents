/**
 * @author Dhruvin
 *
 */
package org.theenergymashuplab.cts.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="EiTender")
@EntityListeners(AuditingEntityListener.class)

public class EiTenderType_new{
	
	private long tenderID;
	private long quantity;
	private Instant startTime;
	private long duration;
	private Instant expireTime;
	private TransactiveStateType transactiveState = TransactiveStateType.TENDER;
	
	/**
	 * @return the tenderID
	 */
	public long getTenderID() {
		return tenderID;
	}

	/**
	 * @param tenderID the tenderID to set
	 */
	public void setTenderID(long tenderID) {
		this.tenderID = tenderID;
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
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(long duration) {
		this.duration = duration;
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
	 * @return the transactiveState
	 */
	public TransactiveStateType getTransactiveState() {
		return transactiveState;
	}

	/**
	 * @param transactiveState the transactiveState to set
	 */
	public void setTransactiveState(TransactiveStateType transactiveState) {
		this.transactiveState = transactiveState;
	}

	/**
	 * 
	 * Constructor for setting up all data up to parent class.
	 */
	public EiTenderType_new() {
		
		// Constructor body begin.
		//this.tenderID = tenderId;
		
	}

}
