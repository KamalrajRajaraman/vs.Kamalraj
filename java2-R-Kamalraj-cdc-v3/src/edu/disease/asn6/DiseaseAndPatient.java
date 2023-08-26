package edu.disease.asn6;

import java.util.List;

import edu.disease.asn3.Disease;

public class DiseaseAndPatient {
	private List<Disease> diseases;
	private List<Patient> patient;

	/**
	 * getDiseases() Returns disease Array
	 * 
	 * @return
	 */
	public List<Disease> getDiseases() {
		return diseases;
	}

	/**
	 * setDiseases(List diseases) instantiate disease array
	 * 
	 * @param diseases
	 */
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	/**
	 * getPatient() returns patient array
	 * 
	 * @return
	 */
	public List<Patient> getPatient() {
		return patient;
	}

	/**
	 * setPatient(List<Patient> patient) instantiate patient array
	 * 
	 * @param patient
	 */
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
}
