/**
 * @author Dhruvin
 *
 */
package org.theenergymashuplab.cts.model;

public abstract class PowerProductTemixType extends ProductType{

	public PowerProductTemixType(
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
	}
	
	
}
