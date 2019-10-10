package XSD-01.EIClasses;


/**
 * eiDelivery is a minimal report that assume that all esential parameters (type,
 * etc) come form an existing market context or transaction.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:39 PM
 */
public class EiDeliveryType extends emix:DeliveryType {

	public schemaVersion ref_attribute15;
	public eiDeliveryID ref_element13;
	public createdDateTime ref_element14;

	public EiDeliveryType(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}