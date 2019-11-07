/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package com.eml.energy.model;

import java.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Synchronize;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
//import com.eml.energy.model.GetCurrentDateTime;

@Entity
@Table(name="EiTender")
@EntityListeners(AuditingEntityListener.class)

public class EiTenderModel {

	//private static final java.sql.Date CurrentDateTimeProvider = null;
	@Id
	@NotNull
	private long tenderID;	/*Primary key, we can have only one tender with same ID */
	@NotBlank
	private String emixBase;
	
	
	public String status = "Created";
	// GetCurrentDateTime get;
	//private java.sql.Date Current_Time;
	//private static final DateFormat a = new SimpleDateFormat("yyyy/MM/dd");
	//@Temporal(TemporalType.DATE)
	//@DateTimeFormat(pattern = ")
	private LocalDate Date =gdate();
	
	
	
	    public LocalDate gdate() {
	    	LocalDate localDate = LocalDate.now();
	    	//LocalDate a = (DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
	        //Date date = new Date();
	       // Date  a ;
	        
	        return (localDate);

	        
	       

	    }

	
	/* @Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	public Date getStartDate() {
	    return startDate;
	}
	public void setStartDate(Date startDate) {
	    this.startDate = startDate;
	} */
	@NotNull
	private long transactionID;
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate DATE) {
		Date = DATE;
	}
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
	
	public EiResponseModel getRefID() {
		return refID;
	}
	public void setRefID(EiResponseModel refID) {
		this.refID = refID;
	}
}
