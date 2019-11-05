/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package com.eml.energy.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Table(name="EiTender")
@EntityListeners(AuditingEntityListener.class)

public class EiTenderModel {

	@Id
	@NotNull
	private long tenderID;	/*Primary key, we can have only one tender with same ID */
	@NotBlank
	private String emixBase;
	
	
	public String status = "Created";
	
 
    private Date creationdate;

	@NotNull
	private long transactionID;
	@JoinColumn(name ="FK_refID")
	@ManyToOne
	private  EiResponseModel refID;

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
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}
	//To save date
	
	//public Date getCreationDate() {
		//return CreationDate;
	//}
	
	//private DateTimeFormat CreationDate;

	public void setCreationdate(Date  creationdate) 
	{this.creationdate = creationdate;}
	public Date getCreationdate() 
	{return creationdate;}
	

	public EiResponseModel getRefID() {
		return refID;
	}
	public void setRefID(EiResponseModel refID) {
		this.refID = refID;
	}
}
