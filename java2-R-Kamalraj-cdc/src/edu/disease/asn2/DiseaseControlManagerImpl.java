package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager{
	private Disease[] disease;
	private Patient[] patient;
	/**
	 * constructor that accepts the maximum diseases and the maximum patients that can be stored and 
	 * initialize the arrays using those integer parameters. 
	 * The constructor will throw an IllegalArgumentException with an appropriate message 
	 * if the supplied integers cannot be used to initialize the arrays.
	 * @param maxDiseases
	 * @param maxPatients
	 */
	public DiseaseControlManagerImpl(int maxDiseases,int maxPatients) {
		if( maxDiseases>0 ) {
			this.disease=new Disease[maxDiseases];
		}
		else {
			throw new IllegalArgumentException("Invalid input for maxDiseases :"+maxDiseases+"The value should not be 0 or negative");
		}
		if(maxPatients>0 ) {
			this.patient=new Patient[maxPatients];
			
		}
		else {
			throw new IllegalArgumentException("Invalid input for maxExposures : "+maxPatients+"The value should not be 0 or negative");
		}
	}
	
	
	@Override
	public Disease addDisease(String name) {
		InfectiousDisease infectiousDisease = new InfectiousDisease();
		NonInfectiousDisease nonInfectiousDisease = new NonInfectiousDisease();
		Disease disease=null;
		for(String diseasename:infectiousDisease.getExamples()) {
			if(diseasename.equals(name)) {
				disease=infectiousDisease;
				disease.setName(name);
			}
		}
		for(String diseasename:nonInfectiousDisease.getExamples()) {
			if(diseasename.equals(name)) {
				disease=nonInfectiousDisease;
				disease.setName(name);				
			}
		}
		for(Disease d:this.disease) {
			if(d==null) {
				return d=disease;
			}
			
		}
		throw new IllegalStateException("No more Disease can be added to Disease array");
				
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for(Disease d:disease) {
			if(d.getDiseaseId().equals(diseaseId)) {
				return d;
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		Patient patient = new Patient(maxDiseases, maxExposures);
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		for(Patient p:this.patient) {
			if(p==null) {
				return p=patient;
			}		
		}
		throw new IllegalStateException("No more Patient can be added to Patient Arrary");		
	}

	@Override
	public Patient getPatient(UUID patientId) {
		for(Patient p:this.patient) {
			if(p.getPatientId().equals(patientId)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient =null;
		Disease disease=null;
		for(Patient p:this.patient) {
			if(p.getPatientId().equals(patientId)) {
				patient =p;
			}
		}
		if(patient==null) {
			throw new IllegalArgumentException("Patient is not found");
		}
		for(Disease d:this.disease) {
			if(d.getDiseaseId().equals(diseaseId)) {
				disease=d;
			}
		}
		if(disease==null) {
			throw new IllegalArgumentException("Disease is not found");
		}
		patient.addDiseseId(disease.getDiseaseId());
		
	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient =null;
		for(Patient p:this.patient) {
			if(p.getPatientId().equals(patientId)) {
				patient =p;
			}
		}
		if(patient==null) {
			throw new IllegalArgumentException("Patient is not found");
		}
		patient.addExposure(exposure);
	}


}
