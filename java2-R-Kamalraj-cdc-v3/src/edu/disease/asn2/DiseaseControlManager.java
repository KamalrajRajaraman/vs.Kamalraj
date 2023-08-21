package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {
	/**
	 * Adds a new disease to application.
	 * @param	name
	 * @return	Disease
	 */
	Disease addDisease(String name,boolean infectious);
	/**
	 * Returns the disease or null if not found.
	 * @param	diseaseId
	 * @return	Disease
	 */
	Disease getDisease(UUID diseaseId);
	/**
	 * Adds a new patient to the application. 
	 * Supply the max parameters to the Patient constructor.
	 * @param	firstName
	 * @param	lastName
	 * @param	maxDisease
	 * @param 	maxExposures
	 * @return	Patient
	 */
	Patient addPatient(String firstName,String lastName,int maxDisease,int maxExposures);
	/**
	 * Returns the patient or null if not found.
	 * @param	patientId
	 * @return	Patient
	 */
	Patient getPatient(UUID patientId);
	/**
	 * Adds a disease to a  patient.
	 * @param	patientId
	 * @param	diseaseId
	 */
	void addDiseaseToPatient(UUID patientId,UUID diseaseId);
	/**
	 * Adds an Exposure instance to a patient.
	 * @param	patientId
	 * @param	exposure
	 */
	void addExposureToPatient(UUID patientId,Exposure exposure);
}
