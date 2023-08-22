package edu.disease.asn3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Exposure;

class DiseaseControlManagerImplTest {
	static DiseaseControlManager d;
	@Test
	public void atestConstPara1() {
		assertThrows(IllegalArgumentException.class, ()->d =  new DiseaseControlManagerImpl(-1,2));
	}
	@Test
	public void atestConstPara2() {
		assertThrows(IllegalArgumentException.class, ()->d =  new DiseaseControlManagerImpl(1,-2));
	}
	@Test
	public void btestAddDiseaseTest1() {
		d =  new DiseaseControlManagerImpl(2,2);
		Disease d1 = d.addDisease( "infectious",true);
		Disease d2 =d.addDisease( "infectious",false);
		assertTrue(d1 instanceof InfectiousDisease&& d2  instanceof NonInfectiousDisease);
		
	}
	@Test
	public void btestAddDiseaseTest2() {
		d =  new DiseaseControlManagerImpl(2,2);
		try {
			d.addDisease( "infectious",true);
			d.addDisease( "infectious",false);
			d.addDisease( "infectious",true);
		}catch (Exception e) {
			assertEquals("No more disease can be added to disease array", e.getMessage());
		}
			
		
	}
	@Test
	public void ctestgetDiseaseTest1() {
		d =  new DiseaseControlManagerImpl(2,2);
		Disease d1 = d.addDisease( "infectious1",true);
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 =d.addDisease( "noninfectious2",false);
		d2.setDiseaseId(new UUID(1,2));
		Disease d3 = d.getDisease(new UUID(1,2));
		assertTrue(d3.equals(d2));
		
	}
	@Test
	public void ctestgetDiseaseTest2() {
		d =  new DiseaseControlManagerImpl(2,2);
		Disease d1 = d.addDisease( "infectious1",true);
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 =d.addDisease( "noninfectious2",false);
		d2.setDiseaseId(new UUID(1,2));
		Disease d3 = d.getDisease(new UUID(1,3));
		assertTrue(d3==null);
		
	}
	@Test
	public void dtestAddPatientTest1() {
		d =  new DiseaseControlManagerImpl(2,2);
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		assertTrue(p1 instanceof Patient);
		
	}
	@Test
	public void dtestAddPatientTest2() {
		d =  new DiseaseControlManagerImpl(2,2);
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		try {
			Patient p3 = d.addPatient("Hari","Haran",1,1);
		}
		catch (Exception e) {
			assertEquals("No more Patient can be added to Patient Arrary", e.getMessage());
		}
		
		
	}
	@Test
	public void etestGetPatientTest1() {
		d =  new DiseaseControlManagerImpl(2,2);
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		p1.setPatientId(new UUID(1,2));
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		p2.setPatientId(new UUID(1,1));
		Patient p3 =d.getPatient(new UUID(1,1));
		assertTrue(p2.equals(p3));
		
	}
	@Test
	public void etestGetPatientTest2() {
		d =  new DiseaseControlManagerImpl(2,2);
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		p1.setPatientId(new UUID(1,2));
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		p2.setPatientId(new UUID(1,1));
		Patient p3 =d.getPatient(new UUID(1,3));
		assertTrue(p3==null);
		
	}
	@Test
	public void ftestAddDiseaseToPatientTest1() {
		d =  new DiseaseControlManagerImpl(2,2);
		Disease d1 = d.addDisease( "infectious",true);
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 =d.addDisease( "infectious",false);
		d2.setDiseaseId(new UUID(1,2));
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		p1.setPatientId(new UUID(1,2));
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		p2.setPatientId(new UUID(1,1));
		d.addDiseaseToPatient(new UUID(1,2), new UUID(1,1));
		UUID[] diseaseId =p1.getDiseaseIds();
		assertTrue(diseaseId[0].equals(new UUID(1,1)));
		
	}
	@Test
	public void ftestAddDiseaseToPatientTest2() {
		d =  new DiseaseControlManagerImpl(2,2);
		Disease d1 = d.addDisease( "infectious",true);
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 =d.addDisease( "infectious",false);
		d2.setDiseaseId(new UUID(1,2));
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		p1.setPatientId(new UUID(1,2));
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		p2.setPatientId(new UUID(1,1));
		try {
			d.addDiseaseToPatient(new UUID(1,3), new UUID(1,1));
		}
		catch (Exception e) {
			assertEquals("Patient is not found", e.getMessage());
		}
		
		
		
	}
	@Test
	public void ftestAddDiseaseToPatientTest3() {
		d =  new DiseaseControlManagerImpl(2,2);
		Disease d1 = d.addDisease( "infectious",true);
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 =d.addDisease( "infectious",false);
		d2.setDiseaseId(new UUID(1,2));
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		p1.setPatientId(new UUID(1,2));
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		p2.setPatientId(new UUID(1,1));
		try {
			d.addDiseaseToPatient(new UUID(1,1), new UUID(1,3));
		}
		catch (Exception e) {
			assertEquals("Disease is not found", e.getMessage());
		}

	}
	@Test
	public void ftestAddExposureToPatientTest1() {
		d =  new DiseaseControlManagerImpl(2,2);
		
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		p1.setPatientId(new UUID(1,2));
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		p2.setPatientId(new UUID(1,1));
		
		Exposure e1 = new Exposure(UUID.randomUUID());
		d.addExposureToPatient(new UUID(1,2), e1);
		
		Exposure [] e =p1.getExposures();
		assertTrue(e1.equals(e[0]));
		

	}
	@Test
	public void ftestAddExposureToPatientTest2() {
		d =  new DiseaseControlManagerImpl(2,2);
		
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		p1.setPatientId(new UUID(1,2));
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		p2.setPatientId(new UUID(1,1));
		
		
		Exposure e1 = new Exposure(UUID.randomUUID());
		try {
		d.addExposureToPatient(new UUID(1,3), e1);
		}
		catch (Exception e) {
			assertEquals("Patient is not found", e.getMessage());
		}
		
	}
	@Test
	public void gtestgetExposure() {
		d =  new DiseaseControlManagerImpl(2,2);
		
		Patient p1 = d.addPatient("Kamal","Raj",1,1);
		
		Patient p2 = d.addPatient("Abi","Raj",1,1);
		
		Patient[] p =d.getPatient();
		
		assertTrue(p1.equals(p[0])&&p2.equals(p[1]));
		
		
	}
	@Test
	public void htestgetDisease() {
		d =  new DiseaseControlManagerImpl(2,2);
		Disease d1 = d.addDisease( "infectious",true);
		
		Disease d2 =d.addDisease( "infectious",false);
		Disease[] d3 = d.getDisease();
		
		assertTrue(d1.equals(d3[0])&&d2.equals(d3[1]));
		
		
	}
}
