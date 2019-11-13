package XSD-01.EIClasses;


/**
 * Registration varies from Market to Market so cannot be defined here. Perties
 * wishing to exchange Registration should extend this abstract type to meet their
 * particular needs.
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:40 PM
 */
public abstract class EiRegistrationType {

	public registreePartyID ref_element18;
	public registrarPartyID ref_element19;
	public eiRegistrationInfo ref_element20;

	public EiRegistrationType(){

	}

	public void finalize() throws Throwable {

	}

}