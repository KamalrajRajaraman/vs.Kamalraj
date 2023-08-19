package edu.disease.asn1;

import java.util.UUID;
 /**
  * Disease with the following properties:
  * java.util.UUID diseaseld
  * String name
  */
public class Disease {
	private UUID diseaseId;
	private String name;
	/**
	 * 
	 * @return diseaseId
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}
	/**
	 * 
	 * @param diseaseId
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *  hashCode  method using the UUID property 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
		return result;
	}
	/**
	 * equals method using the UUID property 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}
	/**
	 * toString method that includes all the properties of Class
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}
	
}
