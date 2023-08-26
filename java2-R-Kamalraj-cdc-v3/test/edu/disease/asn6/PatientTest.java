package edu.disease.asn6;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import edu.disease.asn3.Exposure;
import edu.disease.asn6.Patient;

class PatientTest {

	Patient p1 = new Patient();
	UUID patientId;
	
	@Test
	public void atestObject() {
		
		Assertions.assertTrue(p1 instanceof Patient);
		
	}
	
	@Test
	public void dtestGetSetPatientId() {
		patientId = UUID.randomUUID();
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
	public void h1TestEquals() {
		Patient p2 = null;
		assertFalse(p1.equals(p2));
	}
	@Test
	public void h2TestEquals() {
		assertFalse(p1.equals("Kamal"));
	}
	
	@Test
	public void h3TestEquals() {
		p1.setPatientId(new UUID(1,1));
		Patient p2 = new Patient();
		p2.setPatientId(new UUID(1,1));
		assertTrue(p1.equals(p2));
	}

	@Test
	public void h4TestEquals() {
		p1.setPatientId(new UUID(1,1));
		Patient p2 = new Patient();
		p2.setPatientId(new UUID(1,4));
		assertFalse(p1.equals(p2));
	}
	
	@Test
	public void h5TestEquals() {
		
		Patient p2 = new Patient();
		p2.setPatientId(new UUID(1,4));
		assertFalse(p1.equals(p2));
	}
	
	
	@Test
	public void iTestTOString() {
		
		assertTrue(p1.toString() instanceof String);
	
	}
	
	Patient p2;
	
	
	@Test
	public void lTestAddDiseaseID() {
		Patient p1 = new Patient();
		UUID u1 = new UUID(1, 1);
		p1.addDiseseId(u1);
		
	}
	@Test
	public void mTestAddExposures() {
		Patient p1 = new Patient();
		Exposure e1 = new Exposure(UUID.randomUUID());
		p1.addExposure(e1);
		
	}
	@Test
	public void l1TestAddDiseaseID() {
		Patient p1 = new Patient();
		UUID[] u = new UUID[] {new UUID(1, 1),new UUID(1, 2),new UUID(1, 3)};
		for(UUID u1:u) {
			p1.addDiseseId(u1);
		}
		boolean flag=false;
		List<UUID>  u2 =p1.getDiseaseIds();
		for(int i=0;i<u.length;i++) {
			if(u[i].equals(u2.get(i)) ){
				flag=true;
				
			}
		}
		assertTrue(flag);
		
	}

	
	@Test
	public void m1TestAddExposures() throws InterruptedException {
		
		
		Patient p1 = new Patient();
		
	
		
		
		Exposure[] e1 = {new Exposure(UUID.randomUUID()),new Exposure(UUID.randomUUID()),new Exposure(UUID.randomUUID())};
	
	
		for(Exposure e2:e1) {
			p1.addExposure(e2);
		}
		
		boolean flag=false;
		
		List<Exposure>e3  =p1.getExposures();
		for(int i=0;i<e1.length;i++) {
			if(e1[i].equals(e3.get(i))) {
				flag=true;
				
			}
		}
		assertTrue(flag);
		
	}

		@Test
		public void nTestComapareTo(){
			Patient p1 =new Patient();
			p1.setFirstName("raja");
			p1.setLastName("Kamal");
			
			Patient p2 =new Patient();
			p2.setFirstName("raja");
			p2.setLastName("abi");
			ArrayList<Patient> p = new ArrayList<Patient>();
			p.add(p1);
			p.add(p2);
			Collections.sort(p);
			Patient p3 =p.get(0);
			Patient p4 =p.get(1);
			assertTrue(p1.equals(p4)&&p3.equals(p2));
			
		}
		@Test
		public void n1TestComapareTo(){
			Patient p1 =new Patient();
			p1.setLastName("raja");
			p1.setFirstName("Kamal");
			
			Patient p2 =new Patient();
			p2.setLastName("raja");
			p2.setFirstName("abi");
			ArrayList<Patient> p = new ArrayList<Patient>();
			p.add(p1);
			p.add(p2);
			Collections.sort(p);
			
			Patient p3 =p.get(0);
			Patient p4 =p.get(1);
			assertTrue(p1.equals(p4)&&p3.equals(p2));
			
			
		}
	
	
}
