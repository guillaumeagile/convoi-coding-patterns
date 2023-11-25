package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConvoi {
	
	/** 3 camions remorque de 4,5 tonnes chacun pouvant transporter jusqu’à 30 tonnes,
	 *  1 camion-citerne de 3 tonnes pouvant transporter jusqu’à 20 tonnes d’essence 
	 *  et 1 minibus de 1,8 tonne pouvant transporter jusqu’à 9 personnes
	 *  Le convoi doit transporter 12 tonnes de ciment réparties équitablement dans chaque camion remorque 
	 *  et 10 tonnes d’essence dans le camion-citerne
	 */ 
	private Convoi convoi;
	
	@BeforeEach
	void setUp() throws Exception {
		this.convoi = new Convoi();
		CamionRemorque first = new CamionRemorque("first", 4.5F, 30F);
		first.charger(4F);
		this.convoi.ajouterVehicule(first);
		CamionRemorque second = new CamionRemorque("second", 4.5F, 30F);
		second.charger(4F);
		this.convoi.ajouterVehicule(second);
		CamionRemorque third = new CamionRemorque("third", 4.5F, 30F);
		third.charger(4F);
		this.convoi.ajouterVehicule(third);
		CamionCiterne citerne = new CamionCiterne("citerne", 3F, 20F);
		citerne.charger(10F);
		this.convoi.ajouterVehicule(citerne);
		this.convoi.ajouterVehicule(new Minibus("313 BQL 31", 1.8F, 9));
	}

	@AfterEach
	void tearDown() throws Exception {
		this.convoi = null;
	}

	@Test
	void testAcceptanceVitesseMax() {
		assertEquals(80F, this.convoi.vitesseMax());
	}
	
	@Test
	void testDechargementDuConvoi() {
		this.convoi.decharger();
		assertTrue(true);
	}

}
