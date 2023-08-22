package edu.disease.asn3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Exposure;

class ExposureTest {
	
	
	

	@Test
	public void atestGetDataTime() {
		LocalDateTime dateTime =  LocalDateTime.now();
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);
		e1.setDataTime(dateTime);
		assertEquals(dateTime, e1.getDateTime());
		
	}
	
	
	@Test
	public void btestPassingWrongExposureType() {
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);		
		String exposureType ="Dscsc";
		assertThrows(IllegalArgumentException.class,()->e1.setExposureType(exposureType));
		
	}
	@Test
	public void ctestGetExposureType() {
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);		
		String exposureType ="D";
		e1.setExposureType(exposureType);
		assertEquals(exposureType, e1.getExposureType());
		
	}

	@Test
	public void etestGetPatientId() {
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);
		
		assertEquals(a,e1.getPatientId());
		
	}

	
	@Test
	public void gtestSetExposureType() {
		
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);		
		String exposureType ="I";
		e1.setExposureType(exposureType);
		assertEquals(exposureType, e1.getExposureType());
		
		
	}


	@Test
	public void kTestHashCode() {

		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		Exposure e2 = e1;
		assertEquals(e1.hashCode(), e2.hashCode());
	}
	@Test
	public void k1TestHashCode() {
		LocalDateTime dateTime =  null;
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Exposure e2 = e1;
		assertEquals(e1.hashCode(), e2.hashCode());
	}
	@Test
	public void k2TestHashCode() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Exposure e2 = e1;
		assertEquals(e1.hashCode(), e2.hashCode());
	}
	
	@Test
	public void lTestEquals() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Exposure e2 = e1;
		assertTrue(e1.equals(e2));
	}
	
	@Test
	public void mTestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  LocalDateTime.now();
		String exposureType2 ="D";
		UUID a2 = UUID.randomUUID();
		Exposure e2 = new Exposure(a2);	
		e2.setDataTime(dateTime2);
		e2.setExposureType(exposureType2);
		assertFalse(e1.equals(e2));
	}
	@Test
	public void m2TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  null;
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  LocalDateTime.now();
		String exposureType2 ="D";
		UUID a2 = UUID.randomUUID();
		Exposure e2 = new Exposure(a2);	
		e2.setDataTime(dateTime2);
		e2.setExposureType(exposureType2);
		assertFalse(e1.equals(e2));
	}
	@Test
	public void m3TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  null;
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  null;
		String exposureType2 ="D";
		UUID a2 = UUID.randomUUID();
		Exposure e2 = new Exposure(a2);	
		e2.setDataTime(dateTime2);
		e2.setExposureType(exposureType2);
		assertFalse(e1.equals(e2));
	}
	@Test
	public void m5TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  dateTime;
		String exposureType2 ="D";
		UUID a2 = UUID.randomUUID();
		Exposure e2 = new Exposure(a2);	
		e2.setDataTime(dateTime2);
		e2.setExposureType(exposureType2);
		assertFalse(e1.equals(e2));
	}
	@Test
	public void m6TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Thread.sleep(1000);
		LocalDateTime dateTime2 =  dateTime;
		String exposureType2 ="D";
		
		Exposure e2 = new Exposure(a);	
		e2.setDataTime(dateTime2);
		e2.setExposureType(exposureType2);
		assertTrue(e1.equals(e2));
	}
	@Test
	public void m1TestEquals() throws InterruptedException {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		Exposure e2 = null;
		assertFalse(e1.equals(e2));
	}
	
	
	
	
	@Test
	public void zTestTOString() {
		LocalDateTime dateTime =  LocalDateTime.now();
		String exposureType ="I";
		UUID a = UUID.randomUUID();
		Exposure e1 = new Exposure(a);	
		e1.setDataTime(dateTime);
		e1.setExposureType(exposureType);
		assertTrue(e1.toString() instanceof String);
	
	}
	
	
	

}
