/**
 * 
 */
package org.theenergymashuplab.cts.model;

public class EiTransactionType_new extends EiTenderType_new{

	/**
	 * 
	 */
	
	// TransactionIDType transactionID;
	long transactionID;
	
	public EiTransactionType_new(
			long transactionID,
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
				tenderId,
				//ISO3AlphaCurrencyCodeContentType currency,
				// DateTimeType	expirationDate,
				// IntegralOnlyType integralOnly,
				// MarketContextType marketContext,
				// SideType side,
				terms,
				// TransactiveStateType transactiveState,
				emixUid
			);
		
		this.transactionID = transactionID;
	}

}
