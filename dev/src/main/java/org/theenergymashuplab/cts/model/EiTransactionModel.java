/**
 * @author Dhruvin Desai
 * @created 26-Mar-2020
 *
 */
package org.theenergymashuplab.cts.model;


import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 */

@Entity
@Table(name="EiTransaction")
@EntityListeners(AuditingEntityListener.class)
public class EiTransactionModel {
	
	@Id
	@NotNull
	long transactionID;
	
	@NotNull
	@Type(type = "org.theenergymashuplab.cts.model.EiTenderModel")
	EiTenderModel tenderobj;

	/**
	 * @return the transactionID
	 */
	public long getTransactionID() {
		return transactionID;
	}

	/**
	 * @param transactionID the transactionID to set
	 */
	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}

	/**
	 * @return the tenderobj
	 */
	public EiTenderModel getTenderobj() {
		return tenderobj;
	}

	/**
	 * @param tenderobj the tenderobj to set
	 */
	public void setTenderobj(EiTenderModel tenderobj) {
		this.tenderobj = tenderobj;
	}
	
	
}
