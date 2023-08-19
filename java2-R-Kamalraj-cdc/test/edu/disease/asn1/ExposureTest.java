package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;

class ExposureTest {
	Exposure e1 ;

	@Test
	public void atestGetDataTime() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dateTime, exposureType);
		assertEquals(dateTime, e1.getDateTime());
		
	}
	
	
	@Test
	public void btestPassingWrongExposureType() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="Dscsc";
		assertThrows(IllegalArgumentException.class,()->e1 = new Exposure(dateTime, exposureType));
	
	}
	@Test
	public void ctestGetExposureType() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dateTime, exposureType);
		String exposureType1 ="D";
		assertEquals(exposureType1, e1.getExposureType());
		
	}
	
	@Test
	public void dtestGetDataTime() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dateTime, exposureType);
		assertEquals( dateTime, e1.getDateTime());
		
	}
	@Test
	public void etestGetPatientId() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dateTime, exposureType);
		assertNull( e1.getPatientId());
		
	}
	
	@Test
	public void ftestSetDataTime() {
		
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dateTime, exposureType);
		LocalDateTime dateTime1 =  LocalDateTime.now();
		e1.setDataTime(dateTime1);
		assertEquals(dateTime1, e1.getDateTime());
		
		
		
	}
	@Test
	public void gtestSetExposureType() {
		
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dateTime, exposureType);
		String exposureType1 ="I";
		e1.setExposureType(exposureType1);
		assertEquals(exposureType1, e1.getExposureType());
		
		
	}
	@Test
	public void htestWrongSetExposureType() {
		
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dateTime, exposureType);
		String exposureType1 ="Ik";

		assertThrows(IllegalArgumentException.class,()->e1.setExposureType(exposureType1));
		
	}
	
	@Test
	public void itestSetExposureType() {
		
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		String exposureType1 ="D";
		e1.setExposureType(exposureType1);
		assertEquals(exposureType1, e1.getExposureType());
		
		
	}
	
	
	
	@Test
	public void kTestHashCode() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		Exposure e2 = e1;
		assertEquals(e1.hashCode(), e2.hashCode());
	}
	
	@Test
	public void lTestEquals() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		Exposure e2 = e1;
		assertTrue(e1.equals(e2));
	}
	
	@Test
	public void mTestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  LocalDateTime.now();
		String exposureType2 ="D";
		Exposure e2 = new Exposure(dateTime2, exposureType2);
		assertFalse(e1.equals(e2));
	}
	
	@Test
	public void zTestTOString() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		assertTrue(e1.toString() instanceof String);
	
	}
	
	
	
	

}
