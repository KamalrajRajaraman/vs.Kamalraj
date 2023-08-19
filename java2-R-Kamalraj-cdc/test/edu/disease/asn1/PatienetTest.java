package edu.disease.asn1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;
import edu.disease.asn1.Patient;

class PatienetTest {

	Patient p1 = new Patient(5, 5);
	UUID patientId;
	
	@Test
	public void atestObject() {
		
		Assertions.assertTrue(p1 instanceof Patient);
		
	}
	@Test
	public void btestArraySizeExposures() {
		Assertions.assertEquals(5, p1.getExposures().length);
		
	}
	@Test
	public void ctestArraySizeDiseaseIds() {
		Assertions.assertEquals(5, p1.getDiseaseIds().length);
		
	}
	@Test
	public void dtestGetSetPatientId() {
		patientId = new UUID(1, 1);
		p1.setPatientId(patientId);
		Assertions.assertTrue(p1.getPatientId() instanceof UUID);
	}
	
		
	
	@Test
	public void etestGetSetFirstName() {
		String firstName ="kamal";
		p1.setFirstName(firstName);
		Assertions.assertTrue(p1.getFirstName().equals(firstName));
		
	}
	@Test
	public void ftestGetSetLastName() {
		String lastName ="raj";
		p1.setLastName(lastName);
		Assertions.assertTrue(p1.getLastName().equals(lastName));
	}
	@Test
	public void gTestHashCode() {
		Patient p2 = p1;
		assertEquals(p1.hashCode(), p2.hashCode());
	}
	
	@Test
	public void hTestEquals() {
		Patient p2 = p1;
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void iTestTOString() {
		
		assertTrue(p1.toString() instanceof String);
	
	}
	
	Patient p2;
	@Test
	public void jtestObjectWithWrongArg1() {	
		assertThrows(IllegalArgumentException.class,()-> p2 = new Patient(-1, 2));
	}
	@Test
	public void ktestObjectWithWrongArg() {
		
		assertThrows(IllegalArgumentException.class,()-> p2 = new Patient(1,-2));
		
		
	}
	
	@Test
	public void lTestAddDiseaseID() {
		Patient p1 = new Patient(1,1);
		UUID u1 = new UUID(1, 1);
		p1.addDiseseId(u1);
	}
	@Test
	public void mTestAddExposures() {
		Patient p1 = new Patient(1,1);
		Exposure e1 = new Exposure();
		p1.addExposure(e1);
		
	}

	

	
	
	
	
	
	
	
	

}
