package edu.disease.asn6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.UUID;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import edu.disease.asn3.Disease;
import edu.disease.asn3.InfectiousDisease;

class DiseaseFileRepositoryTest {
	static DiseaseFileRepository d;
	@Test
	void atestInit() throws IOException, ClassNotFoundException {
		Disease d1 = new InfectiousDisease();
		d1.setDiseaseId(UUID.randomUUID());
		Disease d2 = new InfectiousDisease();
		d2.setDiseaseId(UUID.randomUUID());
		
		List<Disease> diseases = Arrays.asList(d1,d2);
		 
		String folderPath ="C:\\Users\\Dell\\Desktop\\Assignment\\Repsoitory";
		FileOutputStream fos1 = new FileOutputStream(folderPath + "\\diseases.dat");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(diseases);
		
		Patient p1 = new Patient();
		p1.setPatientId(UUID.randomUUID());
		Patient p2 = new Patient();
		p2.setPatientId(UUID.randomUUID());
		List<Patient> patient = Arrays.asList(p1,p2);
		
		FileOutputStream fos2 = new FileOutputStream(folderPath + "\\patients.dat");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(patient);
		d = new DiseaseFileRepository();
		
		//
		DiseaseAndPatient dp =d.init(folderPath);
		
		List<Disease> diseases1 = dp.getDiseases();
		List<Patient> patient1 = dp.getPatient();
		
		assertTrue(diseases1.equals(diseases));
		//assertTrue(diseases1.get(0).equals(d1)&&patient1.get(0).equals(p1));
		
	}
	@Test
	public void btestsave() throws IOException {
		Disease d1 = new InfectiousDisease();
		d1.setDiseaseId(UUID.randomUUID());
		Disease d2 = new InfectiousDisease();
		d2.setDiseaseId(UUID.randomUUID());
		
		List<Disease> disease = Arrays.asList(d1,d2);
		
		Patient p1 = new Patient();
		p1.setPatientId(UUID.randomUUID());
		Patient p2 = new Patient();
		p2.setPatientId(UUID.randomUUID());
		List<Patient> patient = Arrays.asList(p1,p2);
		
		d.save(disease, patient);
	}
	
	
	
	

}
