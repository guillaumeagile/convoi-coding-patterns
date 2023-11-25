package org.example;

public abstract class VehiculeTransportMarchandise extends Vehicule implements Chargeable {

	/** chargeMax transportee par le vehicule en tonne 
	 *  chargeMax superieur à poids du vehicule et inferieur a 10 fois son poids 
	 */
	protected float chargeMax;
	/** chargeUtile transportee par le vehicule entre 0 et chargeMax */ 
	protected float chargeUtile;
	
	public VehiculeTransportMarchandise(String immatriculation, float poids, float chargeMax) {
		super(immatriculation, poids);
		this.setChargeMax(chargeMax);
		this.chargeUtile = 0F;
	}

	/** Precondition: poids <= chargeMax <= 10 * poids */
	private void setChargeMax(float chargeMax) {
		assert (chargeMax >= this.poids);
		assert (chargeMax <= 10 * poids);
		this.chargeMax = chargeMax;
	}
	
	/** vide un vehicule de sa charge
	 *  PostCondition: chargeUtile = 0F 
	 */
	@Override
	public void vider() {
		this.chargeUtile = 0F;
		assert (this.chargeUtile == 0F);
	}
	
	/** charge un véhicule du poids considere
	 *  Precondition: chargeUtile + poids <= chargeMax
	 *  Postcondition: chargeUtile = chargeUtile + poids  
	 */
	@Override
	public void charger(float poids) {
		assert (this.chargeUtile + poids <= chargeMax);
		this.chargeUtile += poids;
		// test unitaire pour la Postcondition
	}
}
