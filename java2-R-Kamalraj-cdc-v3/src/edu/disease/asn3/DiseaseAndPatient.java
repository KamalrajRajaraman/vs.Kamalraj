package edu.disease.asn3;

public class DiseaseAndPatient {
	private Disease[] diseases;
	private Patient[] patient;
	/**
	 * getDiseases() Returns disease Array
	 * @return
	 */
	public Disease[] getDiseases() {
		return diseases;
	}
	/**
	 * setDiseases(Disease[] diseases) instantiate disease array
	 * @param diseases
	 */
	public void setDiseases(Disease[] diseases) {
		this.diseases = diseases;
	}
	/**
	 * getPatient() returns patient array
	 * @return
	 */
	public Patient[] getPatient() {
		return patient;
	}
	/**
	 *  setPatient(Patient[] patient) instantiate patient array
	 * @param patient
	 */
	public void setPatient(Patient[] patient) {
		this.patient = patient;
	}
}
