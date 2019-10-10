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
@Table(name="EiResponse")
@EntityListeners(AuditingEntityListener.class)


public class EiResponseModel {
	
	@Id
	@NotNull
	private long refID; 
	@NotBlank
	private String responseCode; 
	@NotBlank
	private String responseDescription;
	@NotBlank
	private String responseTermsVoilated;
	
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
}
