/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package org.theenergymashuplab.cts.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="EiDelivery")
@EntityListeners(AuditingEntityListener.class)

public class EiDeliveryModel {
	
	@Id
	@NotNull
	private long eiDeliveryID;			/*Primary Key */
	@NotBlank
	private String createdDateTime; /*To strong date and time */
	
	/* Getter and Setters */
	
	public long getEiDeliveryID() {
		return eiDeliveryID;
	}
	public void setEiDeliveryID(long eiDeliveryID) {
		this.eiDeliveryID = eiDeliveryID;
	}
	
	public String getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
}
