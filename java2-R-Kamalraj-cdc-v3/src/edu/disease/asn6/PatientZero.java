package edu.disease.asn6;

import java.time.LocalDateTime;

/**
 * A class that represents PatientZero with the following properties. private
 * Patient patient; private LocalDateTime exposureDateTime; private boolean
 * exposed;
 * 
 * This class will be used by the Contact Trace class to hold the first patient
 * in a line of exposures.
 * 
 * @author KAMALRAJ
 *
 */

public class PatientZero {

	private Patient patient;
	private LocalDateTime exposureDateTime;
	private boolean exposed;

	/**
	 * getPatient() returns patient Object if instantiated
	 * 
	 * @return
	 */

	public Patient getPatient() {
		return patient;
	}

	/**
	 * setPatient(Patient patient) method used to instantiated patient Filed
	 * 
	 * @param patient
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * Used to retrieve exposureDateTime
	 * 
	 * @return
	 */
	public LocalDateTime getExposureDateTime() {
		return exposureDateTime;
	}

	/**
	 * Used to instantiate exposureDateTime
	 * 
	 * @param exposureDateTime
	 */
	public void setExposureDateTime(LocalDateTime exposureDateTime) {
		this.exposureDateTime = exposureDateTime;
	}

	/**
	 * Used to find exposed or not
	 * 
	 * @return
	 */
	public boolean isExposed() {
		return exposed;
	}

	/**
	 * Used to assign exposed or not
	 * 
	 * @param exposed
	 */
	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}

}
