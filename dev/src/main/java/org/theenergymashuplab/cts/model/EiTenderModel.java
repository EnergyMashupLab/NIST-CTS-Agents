/**
 * @author Dhruvin Desai, Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 * @updated 26-Mar-2020
 */

package org.theenergymashuplab.cts.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import org.theenergymashuplab.cts.model.GetCurrentDateTime;

@Entity
@Table(name="EiTender")
@EntityListeners(AuditingEntityListener.class)
public class EiTenderModel implements Serializable {
	
	@Id
	@NotNull
	private long tenderID; /*Primary key, we can have only one tender with same ID */
	
	@NotNull
	private long quantity;
	
	@NotNull
	private String startTime;
	
	@NotNull
	private long duration;
	
	private String expireTime;
	
	@NotNull
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
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
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
	public String getExpireTime() {
		return expireTime;
	}

	/**
	 * @param expireTime the expireTime to set
	 */
	public void setExpireTime(String expireTime) {
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

	@Override
	public String toString() {
		return "" + tenderID + "\t" + quantity + "\t" + startTime
				+ "\t" + duration + "\t" + expireTime + "\t" + transactiveState;
	}
	
	/*
	 * 		return "tenderID= " + tenderID + ", quantity=" + quantity + ", startTime=" + startTime
				+ ", duration=" + duration + ", expireTime=" + expireTime + ", transactiveState=" + transactiveState;
	 */
	
}
