package org.example;

public abstract class Vehicule {
	
	protected String immatriculation;
	/** le poids d'un vehicule est en tonne et superieur à 1 tonne */
	protected float poids;
	
	/** vitesse maximum autorisee, depend du type de vehicule*/
	public abstract float vitesseMax();

	/** Precondition: immatriculation n'est pas nulle 
	 *  Precondition: poids est superieur a 1 tonne */
	public Vehicule(String immatriculation, float poids) {
		this.setImmatriculation(immatriculation);
		this.setPoids(poids);
	}

	/** Precondition: immatriculation n'est pas nulle */
	private void setImmatriculation(String immatriculation) {
		assert (immatriculation != null);
		this.immatriculation = immatriculation;
	}

	/** Precondition: poids est superieur a 1 tonne */
	private void setPoids(float poids) {
		assert (poids > 1f);
		this.poids = poids;
	}

}
