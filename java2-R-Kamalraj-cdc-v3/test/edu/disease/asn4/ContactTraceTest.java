package edu.disease.asn4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import edu.disease.asn3.Exposure;
import edu.disease.asn3.Disease;
import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.DiseaseControlManagerImpl;
import edu.disease.asn3.InfectiousDisease;
import edu.disease.asn3.Patient;

class ContactTraceTest {

	@Test
	void test() {

		DiseaseControlManager DCM = new DiseaseControlManagerImpl(1, 7);

		Disease corona = DCM.addDisease("corona", true);
		
		UUID coronaUUID = corona.getDiseaseId();

		Patient A = DCM.addPatient("Kamalraj", "R", 1, 0);
		UUID Aid = A.getPatientId();

		Patient B = DCM.addPatient("Kathi", "P", 1, 1);
		UUID Bid = B.getPatientId();

		Patient C = DCM.addPatient("Mani", "P", 1, 2);
		UUID Cid = C.getPatientId();



		DCM.addDiseaseToPatient(Aid, coronaUUID);
		DCM.addDiseaseToPatient(Bid, coronaUUID);
		DCM.addDiseaseToPatient(Cid, coronaUUID);

		Exposure B_A = new Exposure(Aid);
		LocalDateTime dateTimeB_A = LocalDateTime.of(2019, 1, 15, 11, 00);
		B_A.setDateTime(dateTimeB_A);
		B_A.setExposureType("D");


		B.addExposure(B_A);
		
		Exposure C_A = new Exposure(Aid);
		LocalDateTime dateTimeC_A = LocalDateTime.of(2019, 1, 16, 11, 00);
		C_A.setDateTime(dateTimeC_A);
		C_A.setExposureType("D");

		Exposure C_B = new Exposure(Bid);
		LocalDateTime dateTimeC_B = LocalDateTime.of(2019, 1, 17, 10, 00);
		C_B.setDateTime(dateTimeC_B);
		C_B.setExposureType("D");

		
		C.addExposure(C_B);
		C.addExposure(C_A);

		
		ContactTrace CT = new ContactTrace(DCM);
		
		PatientZero zero =CT.findPatientZero(C);
		assertEquals(A, zero.getPatient());
		

	}

}
