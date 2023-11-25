package org.example;

public class Minibus extends VehiculeTransportPersonnes {

	public Minibus(String immatriculation, float poids, int nbMaxPersonnes) {
		super(immatriculation, poids, nbMaxPersonnes);
	}

	@Override
	/** return 130 si nbMaxPersonnes == 6
	 *         120 si 7 <= nbMaxPersonnes <= 9
	 *         110 si nbMaxPersonnes >= 9
	 */
	public float vitesseMax() {
		if (nbMaxPersonnes == 6) {
			return 130F;
		}
		assert(nbMaxPersonnes > 6);
		if (nbMaxPersonnes <= 9) {
			return 120F;
		}
		assert(nbMaxPersonnes > 9);
		return 110F;
		// test unitaire pour la Postcondition
	}

}
