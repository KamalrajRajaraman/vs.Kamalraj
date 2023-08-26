package edu.disease.asn6;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import edu.disease.asn3.Disease;

/**
 * 
 * @author KAMALRAJ
 *
 */
public class DiseaseFileRepository {
	private String folderPath;

	/**
	 * This method serializes and saves the supplied disease and patient array data
	 * to two separate files on the file system using the folder path provided from
	 * the init method. Serialize the disease array data to a file named,
	 * diseases.dat and the patient array data to a file named patients.dat.
	 * 
	 * @param disease
	 * @param patient
	 * @throws IOException
	 */
	public void save(List<Disease> disease, List<Patient> patient) throws IOException {

		FileOutputStream fos1 = new FileOutputStream(folderPath + "\\diseases.dat");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(disease);

		FileOutputStream fos2 = new FileOutputStream(folderPath + "\\patients.dat");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(patient);

		oos1.close();
		oos2.close();
	}

	/**
	 * This method accepts a file path to the folder where the data was serialized
	 * and set the folder path to a property on the class. Deserialize the disease
	 * data from the file named diseases.dat. Deserialize the patient data from the
	 * file named patients. Set both the deserialized disease and patient arrays to
	 * an instance of the Disease AndPatient class and return that instance. Throw
	 * an IllegalArgumentException with an appropriate message if the supplied
	 * folder path is null.
	 * 
	 * @param folderPath
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public DiseaseAndPatient init(String folderPath) throws ClassNotFoundException, IOException {
		this.folderPath = folderPath;

		if (folderPath == null) {
			throw new IllegalArgumentException("Supplied Folder Path is null");
		}
		DiseaseAndPatient dp = new DiseaseAndPatient();

		File f1 = new File(folderPath, "\\diseases.dat");
		if (f1.exists()) {
			FileInputStream fis1 = new FileInputStream(folderPath + "\\diseases.dat");
			ObjectInputStream ois1 = new ObjectInputStream(fis1);
			dp.setDiseases((List<Disease>) ois1.readObject());
			ois1.close();
		}

		File f2 = new File(folderPath, "\\patients.dat");
		if (f2.exists()) {
			FileInputStream fis2 = new FileInputStream(folderPath + "\\patients.dat");
			ObjectInputStream ois2 = new ObjectInputStream(fis2);
			dp.setPatient((List<Patient>) ois2.readObject());
			ois2.close();
		}

		return dp;

	}
}
