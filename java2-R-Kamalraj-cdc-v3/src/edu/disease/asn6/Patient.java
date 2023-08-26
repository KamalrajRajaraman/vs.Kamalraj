package edu.disease.asn6;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Exposure;

/**
 * 
 * @author KAMALRAJ Patient with the following properties: java.util.UUID
 *         patientId String firstName String lastName
 */
public class Patient implements Comparable<Patient>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID patientId;
	private String firstName;
	private String lastName;
	private List<Exposure> exposures;
	private List<UUID> diseaseIds;

	/**
	 * constructor that accepts two parameters. {@code int} maxDiseases- this
	 * parameter used to initiate the {@code diseaseIds} array.
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
	public Patient() {
		exposures = new LinkedList<>();
		diseaseIds = new LinkedList<>();

	}

	/**
	 *
	 * {@code	addDiseseId(UUID diseaseId)}-this method will add the supplied
	 * diseaseId to the diseaseIds array.
	 * 
	 * @return void
	 * @param diseaseId
	 * @throws
	 * 
	 * Throw         an IndexOutOfBoundsExceptionwith the appropriate message if the
	 *               diseaseIds array is full.
	 */
	public void addDiseseId(UUID diseaseId) {
		this.diseaseIds.add(diseaseId);

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
		this.exposures.add(exposure);
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

	public List<UUID> getDiseaseIds() {
		return diseaseIds;
	}

	/**
	 * Returns exposures Array
	 * 
	 * @return exposures
	 */
	public List<Exposure> getExposures() {
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
				+ ", exposures=" + exposures + ", diseaseIds=" + diseaseIds + "]";
	}

	/**
	 * compareTo allow Patient class to be sortable in ascending order by the last
	 * name, then first name. Sorting should be case insensitive.
	 */
	@Override
	public int compareTo(Patient o) {

		if (!this.lastName.equalsIgnoreCase(o.lastName)) {
			return this.lastName.compareToIgnoreCase(o.lastName);
		}
		return this.firstName.compareToIgnoreCase(o.firstName);
	}

}
