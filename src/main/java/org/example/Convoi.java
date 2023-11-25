package org.example;

import java.util.LinkedList;
import java.util.List;

public class Convoi {
	
	/** liste des vehicules d'un convoi */
	private List<Vehicule> vehicules;

	public Convoi() {
		this.vehicules = new LinkedList<Vehicule>();
	}
	
	/** decharge tous les vehicules de transport de marchandises 
	 *  Postcondition : quelque soit v un vehicule de transport de marchandises du convoi, sa charge utile est égale à 0 
	 */
	public void decharger() {
		for (Vehicule v : this.vehicules) {
			if (v instanceof Chargeable) {
				((Chargeable) v).vider();
			}
		}
		assert(this.estAVide());
	}

	private boolean estAVide() {
		for (Vehicule v : this.vehicules) {
			if (v instanceof VehiculeTransportMarchandise) {
				 if (((VehiculeTransportMarchandise) v).chargeUtile != 0) {
					 return false;
				 }
			}
		}
		return true;
	}
	
	/** Ajoute le vehicule v au convoi 
	 *  Precondition : v n'est pas nul */
	public void ajouterVehicule(Vehicule v) {
		assert (v != null);
		this.vehicules.add(v);
	}
	
	/** calcule la vitesse max du convoi qui est le minimum des vitesses max 
	 *  Precondition la liste des vehicules n'est pas vide */ 
	public float vitesseMax() {
		assert (!this.vehicules.isEmpty());
		float vitesseMax = 200.0F;
		for (Vehicule v : this.vehicules) {
			if (v.vitesseMax() < vitesseMax) {
				vitesseMax = v.vitesseMax();
			}
		}
		return vitesseMax;
		// PostCondition a tester
	}
}
