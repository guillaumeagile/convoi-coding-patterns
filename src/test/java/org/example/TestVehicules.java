package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestVehicules {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCamionCiterne() {
		CamionCiterne cc = new CamionCiterne("313 BQL 31", 2.5F, 20F);
		assertEquals(100F, cc.vitesseMax());
		cc.charger(3F);
		assertEquals(94F, cc.vitesseMax());
		cc.charger(17f);
		assertEquals(60F, cc.vitesseMax());
	}
	
	@Test
	void testCamionRemorque() {
		CamionRemorque cr = new CamionRemorque("313 BQL 31", 2.5F, 20F);
		assertEquals(110F, cr.vitesseMax());
		cr.charger(3F);
		assertEquals(107F, cr.vitesseMax());
		cr.charger(17f);
		assertEquals(90F, cr.vitesseMax());
	}
	
	@Test
	void testMinibus() {
		Minibus m6 = new Minibus("313 BQL 31", 2.5F, 6);
		assertEquals(130F, m6.vitesseMax());
		Minibus m7 = new Minibus("313 BQL 31", 2.5F, 7);
		assertEquals(120F, m7.vitesseMax());
		Minibus m9 = new Minibus("313 BQL 31", 2.5F, 9);
		assertEquals(120F, m9.vitesseMax());
		Minibus m10 = new Minibus("313 BQL 31", 2.5F, 10);
		assertEquals(110F, m10.vitesseMax());
	}

}
