/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package com.eml.energy.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="EiTender")
@EntityListeners(AuditingEntityListener.class)
public class EiTenderModel {

	@Id
	@NotNull
	private long tenderID;	/*Primary key, we can have only one tender with same ID */
	@NotBlank
	private String emixBase;
	
	@NotNull
	private long transactionID;

	/*Below are getter and setter methods to set and get the required information fron Entity Model */
	public long getTenderID() {
		return tenderID;
	}
	public void setTenderID(long tenderID) {
		this.tenderID = tenderID;
	}
	public String getEmixBase() {
		return emixBase;
	}
	
	public void setEmixBase(String emixBase) {
		this.emixBase = emixBase;
	}
	public long getTransactionID() {
		return transactionID;
	}
	
	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}
}
