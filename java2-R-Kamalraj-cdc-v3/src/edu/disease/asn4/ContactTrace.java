package edu.disease.asn4;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;

/**
 * A class that represents ContactTrace.
 * 
 * Contact tracing is the process of identifying people who have recently been
 * in contact with someone diagnosed with an infectious disease.
 * 
 * This class helps to exam a patient's direct exposures, then each of their
 * direct exposures, and then their direct exposures, etc. - until you've
 * reached the first patient in the line exposures. We can find the earliest
 * patient in the line of direct exposures starting with a patient. The earliest
 * exposure is defined by the exposure with the oldest date Time value.
 * 
 * 
 * @author KAMALRAj
 *
 */
public class ContactTrace {
	DiseaseControlManager diseaseControlManager;

	/**
	 * ContactTrace Constructor accepts an implementation of DiseaseControlManager
	 * to retrieve the patients.
	 * 
	 * @param diseaseControlManager
	 */
	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.diseaseControlManager = diseaseControlManager;
	}

	/**
	 * This method will accept a patient to start with and loop through the
	 * patient's exposures. It care about direct exposures, i.e., all exposures that
	 * have exposureType equal to "D" - so it ignore indirect exposures. For each
	 * direct exposure, compare its dateTime value to the prior earliest exposure.
	 * If the exposure is before the prior exposure, then assign it as the prior
	 * earliest exposure. Continue with this logic until it recursively evaluated
	 * all exposures in the line of exposures starting with the first patient.
	 * 
	 * @param patient
	 * @return The findPatientZero method should return an instance of PatientZero.
	 */
	public PatientZero findPatientZero(Patient patient) {

		if (patient.getExposures().length == 0) {
			PatientZero patientZero = new PatientZero();
			patientZero.setPatient(patient);
			patientZero.setExposed(false);
			return patientZero;

		}

		Exposure[] exposures = patient.getExposures();
		Exposure earliestExposure = exposures[0];
		for (int i = 1; i < exposures.length; i++) {

			if (exposures[i].getExposureType().equals("D")) {
				if (earliestExposure.getDateTime().isAfter(exposures[i].getDateTime())) {
					earliestExposure = exposures[i];
				}
			}
		}

		Patient earliestpatient = diseaseControlManager.getPatient(earliestExposure.getPatientId());

		return findPatientZero(earliestpatient);

	}

}
