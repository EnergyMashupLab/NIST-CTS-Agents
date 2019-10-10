package XSD-01.EIClasses;


/**
 * Similar to HTTP 1.1 Error Pattern, 1st digit sufficient for most error
 * processing
 *      - 1xx: Informational - Request received, continuing process
 *      - 2xx: Success - The action was successfully received, understood, and
 * accepted
 *      - 3xx: Pending - Further action must be taken in order to complete the
 * request
 *      - 4xx: Requester Error - The request contains bad syntax or cannot be
 * fulfilled
 *      - 5xx: Responder Error - The responder failed to fulfill an apparently
 * valid request
 *      xx is used for defining more fine grained errors
 * 
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:53 PM
 */
public class ResponseCodeType extends string {

	public ResponseCodeType(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}