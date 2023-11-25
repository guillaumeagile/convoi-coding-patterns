package org.example;

public abstract class VehiculeTransportPersonnes extends Vehicule {

	/** 6 <= nbMaxPersonnes */
	protected int nbMaxPersonnes;
	

	public VehiculeTransportPersonnes(String immatriculation, float poids, int nbMaxPersonnes) {
		super(immatriculation, poids);
		this.setNbMaxPersonnes(nbMaxPersonnes);
	}

	/** 6 <= nbMaxPersonnes*/
	private void setNbMaxPersonnes(int nbMaxPersonnes) {
		assert (6 <= nbMaxPersonnes);
		this.nbMaxPersonnes = nbMaxPersonnes;
	}
}
