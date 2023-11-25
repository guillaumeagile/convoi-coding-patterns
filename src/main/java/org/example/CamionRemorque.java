package org.example;

public class CamionRemorque extends VehiculeTransportMarchandise {
	
	/** en kilometre heure */
	public static final float VITESSE_MAX = 110f; 

	public CamionRemorque(String immatriculation, float poids, float chargeMax) {
		super(immatriculation, poids, chargeMax);
	}

	@Override
	/** vitesseMax = 110 moins 1 kilometre heure par tonne transportee */
	public float vitesseMax() {
		return VITESSE_MAX - ((int) this.chargeUtile);
		// test unitaire pour la Postcondition 
	}

}
