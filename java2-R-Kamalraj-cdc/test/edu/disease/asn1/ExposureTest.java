package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

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
	public void k1TestHashCode() {
		LocalDateTime dateTime =  null;
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		
		Exposure e2 = e1;
		assertEquals(e1.hashCode(), e2.hashCode());
	}
	@Test
	public void k2TestHashCode() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		e1.patientId=new UUID(1, 1);
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
	public void m2TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  null;
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  LocalDateTime.now();
		String exposureType2 ="D";
		Exposure e2 = new Exposure(dateTime2, exposureType2);
		assertFalse(e1.equals(e2));
	}
	@Test
	public void m3TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  null;
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		e1.patientId=new UUID(1, 1);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  null;
		String exposureType2 ="D";
		Exposure e2 = new Exposure(dateTime2, exposureType2);
		assertFalse(e1.equals(e2));
	}
	@Test
	public void m5TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  dateTime;
		String exposureType2 ="D";
		Exposure e2 = new Exposure(dateTime2, exposureType2);
		e2.patientId=new UUID(1, 1);
		assertFalse(e1.equals(e2));
	}
	@Test
	public void m6TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		e1.patientId=new UUID(1, 1);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  dateTime;
		String exposureType2 ="D";
		Exposure e2 = new Exposure(dateTime2, exposureType2);
		e2.patientId=e1.patientId;
		assertTrue(e1.equals(e2));
	}
	@Test
	public void m1TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dateTime, exposureType);
		Exposure e2 = null;
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
