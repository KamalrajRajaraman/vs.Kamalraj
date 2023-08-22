package edu.disease.asn3;

import java.util.UUID;



public class DiseaseControlManagerImpl implements DiseaseControlManager {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Disease[] disease;
	private Patient[] patient;

	/**
	 * constructor that accepts the maximum diseases and the maximum patients that
	 * can be stored and initialize the arrays using those integer parameters. 
	 * 
	 * @param maxDiseases
	 * @param maxPatients
	 * 
	 * @throws	throw an IllegalArgumentException with an appropriate
	 * message if the supplied integers cannot be used to initialize the arrays.
	 */
	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (maxDiseases > 0) {
			this.disease = new Disease[maxDiseases];
		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxDiseases :" + maxDiseases + "The value should not be 0 or negative");
		}
		if (maxPatients > 0) {
			this.patient = new Patient[maxPatients];

		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxExposures : " + maxPatients + "The value should not be 0 or negative");
		}
	}
	/**
	 * @throws	IllegalStateException when no more disease can be added to disease array
	 */
	@Override
	public Disease addDisease(String name, boolean infectious) {
		Disease disease;
		if (infectious) {
			disease = new InfectiousDisease();
			disease.setName(name);
		} else {
			disease = new NonInfectiousDisease();
			disease.setName(name);
		}
		for (int i = 0; i < this.disease.length; i++) {
			if (this.disease[i] == null) {
				this.disease[i] = disease;
				break;

			}
			if (i == this.disease.length - 1) {
				throw new IllegalStateException("No more disease can be added to disease array");
			}
		}
		return disease;

	}

	@Override
	public Disease getDisease(UUID diseaseId) {

		for (Disease d : disease) {
			if (d.getDiseaseId().equals(diseaseId)) {
				return d;
			}
		}
		return null;
	}
	/**
	 * @throws	IllegalStateException when no more Patient can be added to Patient Arrary
	 */
	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		Patient patient = new Patient(maxDiseases, maxExposures);
		patient.setFirstName(firstName);
		patient.setLastName(lastName);

		for (int i = 0; i < this.patient.length; i++) {
			if (this.patient[i] == null) {
				this.patient[i] = patient;
				break;
			}
			if (i == this.patient.length - 1) {
				throw new IllegalStateException("No more Patient can be added to Patient Arrary");
			}
		}
		return patient;

	}

	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient p : this.patient) {
			if (p.getPatientId().equals(patientId)) {
				return p;
			}
		}
		return null;
	}
	/**
	 * @throws	IllegalArgumentException when Patient or Disease  is not found 
	 */
	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = null;
		Disease disease = null;
		for (Patient p : this.patient) {
			if (p.getPatientId().equals(patientId)) {
				patient = p;
				break;
			}
		}
		if (patient == null) {
			throw new IllegalArgumentException("Patient is not found");
		}
		for (Disease d : this.disease) {
			if (d.getDiseaseId().equals(diseaseId)) {
				disease = d;
				break;
			}
		}
		if (disease == null) {
			throw new IllegalArgumentException("Disease is not found");
		}
		patient.addDiseseId(disease.getDiseaseId());

	}
	/**
	 * @throws IllegalArgumentException when Patient is not found
	 */
	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient = null;
		for (Patient p : this.patient) {
			if (p.getPatientId().equals(patientId)) {
				patient = p;
				break;
			}
		}
		if (patient == null) {
			throw new IllegalArgumentException("Patient is not found");
		}
		patient.addExposure(exposure);
	}
	
	@Override
	public Disease[] getDisease() {
		return disease;
	}
	
	@Override
	public Patient[] getPatient() {	
		return patient;
	}
	

}
