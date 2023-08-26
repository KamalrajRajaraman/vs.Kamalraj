package edu.disease.asn1;

import java.util.Arrays;
import java.util.UUID;

/**
 * *Patient with the following properties: java.util.UUID patientld String
 * firstName String lastName
 * 
 * @author KAMALRAJ
 * 
 */
public class Patient {
	private UUID patientId;
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;

	/**
	 * constructor that accepts two parameters. {@code int} maxDiseases- this
	 * parameter used to initiate the {@code diseaselds} array.
	 * {@code int maxExposures}- Use this parameter to initiate the
	 * {@code exposures }array.
	 * 
	 * 
	 * @param maxDiseases
	 * @param maxExposures
	 * 
	 * @throws throw an IllegalArgumentException with the appropriate message if the
	 *               max Diseases or maxExposure values cannot be used to initiate
	 *               the arrays.
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases > 0) {
			this.diseaseIds = new UUID[maxDiseases];
		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxDiseases :" + maxDiseases + "The value should not be 0 or negative");
		}
		if (maxExposures > 0) {
			this.exposures = new Exposure[maxExposures];

		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxExposures : " + maxExposures + "The value should not be 0 or negative");
		}
	}

	/**
	 *
	 * {@code	addDiseseId(UUID diseaseId)}-this method will add the supplied
	 * diseaseId to the diseaseIds array.
	 * 
	 * @return void
	 * @param diseaseId
	 * @throws Throw an IndexOutOfBoundsExceptionwith the appropriate message if the
	 *               diseaseIds array is full.
	 */
	public void addDiseseId(UUID diseaseId) {

		for (int i = 0; i < diseaseIds.length; i++) {
			if (diseaseIds[i] == null) {
				diseaseIds[i] = diseaseId;
				break;
			}
			if (i == diseaseIds.length - 1) {
				throw new IndexOutOfBoundsException("diseseId array is full");
			}
		}

	}

	/**
	 * 
	 * {@code	addExposure(Exposure exposure)}- this method will add the supplied
	 * exposure to the exposures array.
	 * 
	 * @param exposure
	 * 
	 * @throws Throw an IndexOutOfBoundsException with the appropriate message if
	 *               the exposures array has reached its maximum capacity.
	 */
	public void addExposure(Exposure exposure) {
		for (int i = 0; i < exposures.length; i++) {
			if (exposures[i] == null) {
				exposures[i] = exposure;
				break;
			}
			if (i == exposures.length - 1) {
				throw new IndexOutOfBoundsException("exposures array is full");
			}

		}
	}

	/**
	 * Returns patientID
	 * 
	 * @return patientId
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * Instantiate patientId
	 * 
	 * @param patientId
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Returns firstName
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Instantiate firstName
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns lastName
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Instantiate lastName
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns diseaseIds Array
	 * 
	 * @return diseaseIds
	 */

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	/**
	 * Returns exposures Array
	 * 
	 * @return exposures
	 */
	public Exposure[] getExposures() {
		return exposures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}

}
