package edu.disease.asn3;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * A class that represents Exposure.
 * <li>class Exposure with the following properties java.util.UUID patientld
 * java.time.LocalDateTime dateTime String exposureType
 * 
 * @author KAMALRAJ
 * 
 */
public class Exposure implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;

	/**
	 * Initializes a newly created {@code Exposure} object.
	 * 
	 * @param dataTime     the LocalDateTime reference
	 * @param exposureType the String reference
	 * 
	 * @throws Throw an IllegalArgumentException with the appropriate message while
	 *               the supplied exposure type is not "D" and not "I".
	 * 
	 */

	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Returns patientId
	 * 
	 * @return patientId
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * Returns dateTime
	 * 
	 * @return dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * Instantiate dateTime
	 * 
	 * @param dateTime
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Returns exposureType
	 * 
	 * @return exposureType
	 */
	public String getExposureType() {
		return exposureType;
	}

	/**
	 * The setExposureType set exposure Type property should only be allowed to
	 * accept the values, "D" for direct exposure or "I" for indirect exposure.
	 * 
	 * @param exposureType the String reference
	 * 
	 * @throws Throw an IllegalArgumentException with the appropriate message within
	 *               the setExposure Type method if the supplied exposure type is
	 *               not "D" and not "I".
	 * 
	 */
	public void setExposureType(String exposureType) {
		if (exposureType.equals("D") || exposureType.equals("I")) {
			this.exposureType = exposureType;
		} else {
			throw new IllegalArgumentException("Supplied exposure type is not\"D\" and not \"T\"");
		}
	}

	/**
	 * Generate hashCode using the patientId, and dateTime properties .
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
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
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	/**
	 * Returns a string representation of the object. In other words, this method
	 * returns a string equal to thevalue of:
	 * <li>Exposure [patientId= + patientId + ", dateTime=" + dateTime + ",
	 * exposureType=" + exposureType + "]
	 */
	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}

}
