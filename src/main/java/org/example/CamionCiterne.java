package org.example;

public class CamionCiterne extends VehiculeTransportMarchandise {

	/** en kilometre heure */
	public static final float VITESSE_MAX = 100f; 
	public CamionCiterne(String immatriculation, float poids, float chargeMax) {
		super(immatriculation, poids, chargeMax);
	}

	@Override
	/** vitesseMax = 100 moins 2 kilometre heure par tonne transportee */
	public float vitesseMax() {
		return VITESSE_MAX - ((int) this.chargeUtile) * 2;
		// test unitaire pour la Postcondition 
	}

}
