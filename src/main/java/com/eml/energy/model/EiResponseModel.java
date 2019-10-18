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

import java.sql.Date;

import javax.persistence.*;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

@Entity
@Table(name="EiResponse")
@EntityListeners(AuditingEntityListener.class)


public class EiResponseModel  {
	
	@Id
	@NotNull
	private long refID; 
	@NotBlank
	private String responseCode; 
	@NotBlank
	private String responseDescription;
	@NotBlank
	private String responseTermsVoilated;
	private Date TransactionDate;
	
	@JoinColumn(name ="FK_tenderID")
	@ManyToOne
	private  EiTenderModel tenderID;
	
	/*Getter and Setter method */
	public long getRefID() {
		return refID;
	}
	public void setRefID(long refID) {
		this.refID = refID;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	public String getResponseTermsVoilated() {
		return responseTermsVoilated;
	}
	public void setResponseTermsVoilated(String responseTermsVoilated) {
		this.responseTermsVoilated = responseTermsVoilated;
	}
	
	//Foreign key 
	public EiTenderModel getTenderID() {
		return tenderID;
	}
	public void setTenderID(EiTenderModel tenderID) {
		this.tenderID = tenderID;
	}
	//To save date
	@Temporal(TemporalType.DATE)
    @Column(name = "TransactionDate")
    public Date getTransactionDate() {
        return TransactionDate;
    }
	
	@Override
	public String toString() {
		return "RefId: "+ this.getRefID() +" ResponseCode: "+this.getResponseCode()+" ResponseDescription: "+this.getResponseDescription()+
				" RespnseTermsViolated: "+getResponseTermsVoilated();
		
	}
}
