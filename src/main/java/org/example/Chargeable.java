package org.example;

public interface Chargeable {

	/** vide un vehicule de sa charge
	 *  PostCondition: chargeUtile = 0F 
	 */
	void vider();

	/** charge un véhicule du poids considere
	 *  Precondition: chargeUtile + poids <= chargeMax
	 *  Postcondition: chargeUtile = chargeUtile + poids  
	 */
	void charger(float poids);

}