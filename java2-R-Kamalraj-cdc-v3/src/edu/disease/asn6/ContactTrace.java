package edu.disease.asn6;



import java.util.List;

import edu.disease.asn3.Exposure;
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
	
	public PatientZero findPatientZero(Patient patient) {
		
		if(patient.getExposures().size()==0) {
			PatientZero patientZero = new PatientZero();
			patientZero.setPatient(patient);
			patientZero.setExposed(false);
			return patientZero;
	
		}
		
		List<Exposure> exposures = patient.getExposures();
		
		Exposure earliestExposure =exposures.get(0);
		for(int i=1;i<exposures.size();i++) {
			
			if(exposures.get(i).getExposureType().equals("D")) {
				if(earliestExposure.getDateTime().isAfter(exposures.get(i).getDateTime())){
					earliestExposure=exposures.get(i);
				}
			}
		}
		
		Patient earliestpatient =diseaseControlManager.getPatient(earliestExposure.getPatientId());
	
		return findPatientZero(earliestpatient);
			
	}
	
	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.diseaseControlManager=diseaseControlManager;
	}

}
