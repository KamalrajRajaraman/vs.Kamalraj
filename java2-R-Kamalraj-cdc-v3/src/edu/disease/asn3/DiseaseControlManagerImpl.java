package edu.disease.asn3;

import java.util.UUID;

public class DiseaseControlManagerImpl implements DiseaseControlManager {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Disease[] diseases;
	private Patient[] patients;

	/**
	 * constructor that accepts the maximum diseases and the maximum patients that
	 * can be stored and initialize the arrays using those integer parameters.
	 * 
	 * @param maxDiseases
	 * @param maxPatients
	 * 
	 * @throws throw an IllegalArgumentException with an appropriate message if the
	 *               supplied integers cannot be used to initialize the arrays.
	 */
	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (maxDiseases > 0) {
			this.diseases = new Disease[maxDiseases];
		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxDiseases :" + maxDiseases + "The value should not be 0 or negative");
		}
		if (maxPatients > 0) {
			this.patients = new Patient[maxPatients];

		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxExposures : " + maxPatients + "The value should not be 0 or negative");
		}
	}

	/**
	 * @throws IllegalStateException when no more disease can be added to disease
	 *                               array
	 */
	@Override
	public Disease addDisease(String name, boolean infectious) {
		Disease disease;
		if (infectious) {
			disease = new InfectiousDisease();
			disease.setName(name);
			UUID diseaseUUID = UUID.randomUUID();
			disease.setDiseaseId(diseaseUUID);

		} else {
			disease = new NonInfectiousDisease();
			disease.setName(name);
			UUID diseaseUUID = UUID.randomUUID();
			disease.setDiseaseId(diseaseUUID);

		}
		for (int i = 0; i < this.diseases.length; i++) {
			if (this.diseases[i] == null) {
				this.diseases[i] = disease;
				break;

			}
			if (i == this.diseases.length - 1) {
				throw new IllegalStateException("No more disease can be added to disease array");
			}
		}
		return disease;

	}

	@Override
	public Disease getDisease(UUID diseaseId) {

		for (Disease d : diseases) {
			if (d.getDiseaseId().equals(diseaseId)) {
				return d;
			}
		}
		return null;
	}

	/**
	 * @throws IllegalStateException when no more Patient can be added to Patient
	 *                               Arrary
	 */
	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		Patient patient = new Patient(maxDiseases, maxExposures);
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		UUID id = UUID.randomUUID();
		patient.setPatientId(id);

		for (int i = 0; i < this.patients.length; i++) {
			if (this.patients[i] == null) {
				this.patients[i] = patient;
				break;
			}
			if (i == this.patients.length - 1) {
				throw new IllegalStateException("No more Patient can be added to Patient Arrary");
			}
		}
		return patient;

	}

	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient p : this.patients) {
			if (p.getPatientId().equals(patientId)) {
				return p;
			}
		}
		return null;
	}

	/**
	 * @throws IllegalArgumentException when Patient or Disease is not found
	 */
	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = null;
		Disease disease = null;
		for (Patient p : this.patients) {
			if (p.getPatientId().equals(patientId)) {
				patient = p;
				break;
			}
		}
		if (patient == null) {
			throw new IllegalArgumentException("Patient is not found");
		}
		for (Disease d : this.diseases) {
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
		for (Patient p : this.patients) {
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
		return diseases;
	}

	@Override
	public Patient[] getPatient() {
		return patients;
	}

}
