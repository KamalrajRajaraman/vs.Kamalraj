package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import  org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.disease.asn1.Disease;

class DiseaseTest {
	static Disease d1 = new Disease();
	
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
	public void hTestTOString() {
		
		assertTrue(d1.toString() instanceof String);
	
	}
	

}
