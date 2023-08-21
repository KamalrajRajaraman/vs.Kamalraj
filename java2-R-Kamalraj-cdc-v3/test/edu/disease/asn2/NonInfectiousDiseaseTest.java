package edu.disease.asn2;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.disease.asn2.Disease;


class NonInfectiousDiseaseTest {
static Disease d1 = new NonInfectiousDisease();
	
	@Test
	public void atestObject() {
		
		Assertions.assertTrue(d1 instanceof Disease);
		
	}
	
	@Test
	public void btestgetSetDiseaseID() {
		d1.setDiseaseId(new UUID(1,1));
		Assertions.assertTrue(d1.getDiseaseId() instanceof UUID);
	}
	
	@Test
	public void cTestGetSetName() {
		d1.setName("kamal");
		Assertions.assertTrue(d1.getName().equals("kamal"));
		
	}
	@Test
	public void dTestHashCode() {
		Disease d2 =d1;
		assertEquals(d1.hashCode(), d2.hashCode());
	}
	
	@Test
	public void eTestEquals() {
		Disease d2=d1;
		assertTrue(d1.equals(d2));
	}
	@Test
	public void e1TestEquals() {
		Disease d1 = null;
		Disease d2= NonInfectiousDiseaseTest.d1;
		assertFalse(d2.equals(d1));
	}
	@Test
	public void e2TestEquals() {
		Disease d1 = new  NonInfectiousDisease();
		Disease d2 = new NonInfectiousDisease();
		d2.setDiseaseId(new UUID(1,1));
		assertFalse(d1.equals(d2));
	}
	@Test
	public void e3TestEquals() {
		Disease d1 = new NonInfectiousDisease();
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 = new NonInfectiousDisease();
		d2.setDiseaseId(new UUID(1,2));
		assertFalse(d1.equals(d2));
	}
	@Test
	public void e4TestEquals() {
		Disease d1 = new NonInfectiousDisease();
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 = new NonInfectiousDisease();
		d2.setDiseaseId(new UUID(1,1));
		assertTrue(d1.equals(d2));
	}
	@Test
	public void e5TestEquals() {
		Disease d1 = new NonInfectiousDisease();
		d1.setDiseaseId(new UUID(1,1));
		
		assertFalse(d1.equals("Kamal"));
	}
	@Test
	public void e6TestEquals() {
		Disease d1 = new NonInfectiousDisease();
		Disease d2 = new NonInfectiousDisease();
		assertTrue(d1.equals(d2));
	}


	
	@Test
	public void hTestTOString() {
		
		assertTrue(d1.toString() instanceof String);
	
	}
	@Test
	public void iTestgetExamples() {
		Disease d1 = new NonInfectiousDisease();
		assertTrue(d1.getExamples() instanceof String[]);
	}
	

}
