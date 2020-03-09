/**
 * 
 */
package org.theenergymashuplab.cts.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="EiTender")
@EntityListeners(AuditingEntityListener.class)

public class EiTenderType_new extends PowerProductTemixType{
	
	protected long tenderID;

	/**
	 * 
	 * Constructor for setting up all data up to parent class.
	 */
	public EiTenderType_new(
				long tenderId,
				//ISO3AlphaCurrencyCodeContentType currency,
				// DateTimeType	expirationDate,
				// IntegralOnlyType integralOnly,
				// MarketContextType marketContext,
				// SideType side,
				boolean terms,
				// TransactiveStateType transactiveState,
				EmixUidType emixUid
			) {
		
		// Constructor body begin.
		super(
				//ISO3AlphaCurrencyCodeContentType currency,
				// DateTimeType	expirationDate,
				// IntegralOnlyType integralOnly,
				// MarketContextType marketContext,
				// SideType side,
				terms,
				// TransactiveStateType transactiveState,
				emixUid
			);
		
		this.tenderID = tenderId;
		
	}

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
}
