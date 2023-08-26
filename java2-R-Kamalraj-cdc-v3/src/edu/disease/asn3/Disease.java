package edu.disease.asn3;

import java.io.Serializable;
import java.util.UUID;

/**
 * A class that represents Disease.
 * 
 * Disease has the following properties: java.util.UUID diseaseId String name
 * 
 */
public abstract class Disease implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID diseaseId;
	private String name;

	/**
	 * Returns diseaseId of the Disease Object
	 * 
	 * @return UUID type diseaseId of the Disease Object
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * Instantiate diseaseId of Disease class Object
	 * 
	 * @param diseaseId the UUID reference
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * Returns name of the Disease class Object
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Instantiate name of Disease class Object
	 * 
	 * @param name A reference of String which is used to Instantiate name of
	 *             Disease class Object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns a hash code value for the object based on diseaseId property of the
	 * Disease class
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
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
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}

	/**
	 * Returns a string representation of the Disease object. this method returns a
	 * string equal to the value of: Disease [diseaseId=" + diseaseId + ", name=" +
	 * name + "]
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

	public abstract String[] getExamples();

}
