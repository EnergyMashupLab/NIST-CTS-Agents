/**
 * 
 */
package org.theenergymashuplab.cts.model;

public abstract class ProductType extends EmixBaseType{
	
	// ISO3AlphaCurrencyCodeContentType currency;
	
	// DateTimeType	expirationDate;
	
	// IntegralOnlyType integralOnly;
	
	// MarketContextType marketContext;
	
	// SideType side;

	public boolean terms;
	
	// TransactiveStateType transactiveState;
	
	public ProductType(
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
		super(emixUid);
		// this.currency = currency;
		// this.expirationDate = expirationDate;
		// this.integralOnly = integralOnly;
		// this.marketContext = marketContext;
		// this.side = side;
		
		this.terms = terms;
		
		// this.transactiveState = transactiveState;
	}

}
