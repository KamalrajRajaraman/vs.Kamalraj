package edu.disease.asn4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Patient;

class PatientZeroTest {

	@Test
	void test1() {
		Patient patient = new Patient(1,2);
		PatientZero patientZero = new PatientZero();
		patientZero .setPatient(patient);
		assertEquals(patient, patientZero.getPatient());
		
	}
	@Test
	void test2() {
		LocalDateTime exposureDateTime = LocalDateTime.now();
		PatientZero patientZero = new PatientZero();
		patientZero .setExposureDateTime(exposureDateTime);
		assertEquals(exposureDateTime, patientZero.getExposureDateTime());
		
	}
	@Test
	void test3() {
		
		PatientZero patientZero = new PatientZero();
		patientZero .setExposed(true);
		assertEquals(true, patientZero.isExposed());
		
	}

}
