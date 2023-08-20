package edu.disease.asn1;
/**
 * 
 */
import java.time.LocalDateTime;
import java.util.UUID;
/**
 * 
 * @author KAMALRAJ
 * class  Exposure with the following properties
 *java.util.UUID patientld
 * java.time.LocalDateTime dateTime
 * String exposureType
 */
public class Exposure  {
	
	
	protected UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;
	/**
	 * 
	 * @param dataTime
	 * @param exposureType
	 * 
	 * 
	 */
	
	public Exposure(LocalDateTime dateTime,String exposureType) {
		setDataTime(dateTime);
		setExposureType(exposureType);
	}

	/**
	 * 
	 * @return patientId
	 */
	public UUID getPatientId() {
		return patientId;
	}
	/**
	 * 
	 * @return dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	/**
	 * 
	 * @param dateTime
	 */
	public void setDataTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * getExposureType method returns exposureType
	 * @return exposureType
	 */
	public String getExposureType() {
		return exposureType;
	}
	/**
	 * 
	 * @param exposureType
	 * The setExposureType set exposure Type property should only be allowed to accept the values, "D" for direct exposure
	 * or "I" for indirect exposure. Throw an IllegalArgumentException with the appropriate message
	 * within the setExposure Type method if the supplied exposure type is not "D" and not "I".

	 */
	public void setExposureType(String exposureType) {
		if(exposureType.equals("D")||exposureType.equals("I")) {
			this.exposureType = exposureType;
		}
		else {
			throw new IllegalArgumentException("Supplied exposure type is not\"D\" and not \"T\"");
		}
	}
	/**
	 *hashCode method using the patientId, and dateTime properties as the fields.
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;

				
	}
	/**
	 * equals method using the patientId, and dateTime properties as the fields.
	 */
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
	 * toString method that includes all the properties of Class
	 */
	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}
	
	
	
	
	
	
}
