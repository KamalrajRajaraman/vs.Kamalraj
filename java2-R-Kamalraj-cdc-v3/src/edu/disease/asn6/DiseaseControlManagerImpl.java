package edu.disease.asn6;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.InfectiousDisease;
import edu.disease.asn3.NonInfectiousDisease;

public class DiseaseControlManagerImpl implements DiseaseControlManager {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Disease> diseases;
	private List<Patient> patients;

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
	public DiseaseControlManagerImpl() {
		diseases = new LinkedList<>();
		patients = new LinkedList<>();

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
		this.diseases.add(disease);
		return disease;

	}

	@Override
	public Disease getDisease(UUID diseaseId) {

		for (Disease disease : diseases) {
			if (disease.getDiseaseId().equals(diseaseId)) {
				return disease;
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
		Patient patient = new Patient();
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		UUID id = UUID.randomUUID();
		patient.setPatientId(id);
		this.patients.add(patient);
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
	public List<Disease> getDiseases() {
		return diseases;
	}

	@Override
	public List<Patient> getPatients() {
		return patients;
	}

}
