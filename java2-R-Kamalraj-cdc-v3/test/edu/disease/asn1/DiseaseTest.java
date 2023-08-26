package edu.disease.asn1;

import static org.junit.Assert.assertFalse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.Before;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class DiseaseTest {
	static Disease d1 = new Disease();
	static UUID  diseaseId = UUID.randomUUID();
	
	
	@Order(1)  
	@Test 
	public void Object() {
		
		Assertions.assertTrue(d1 instanceof Disease);
		
	}
	
	@Order(2)  
	@Test
	public void getSetDiseaseID() {
		
		d1.setDiseaseId(diseaseId);
		Assertions.assertEquals(diseaseId,d1.getDiseaseId() );
	}
	@Order(3)  
	@Test
	public void GetSetName() {
		d1.setName("kamal");
		Assertions.assertTrue(d1.getName().equals("kamal"));
		
	}
	
	@Order(4)  
	@Test
	public void HashCodeCondition1() {
		Disease d2 = new Disease();
		d2.setDiseaseId(diseaseId);
		assertEquals(d1.hashCode(), d2.hashCode());
	}
	
	@Order(5)  
	@Test
	public void HashCodeCondition2() {
		Disease d1 = new Disease();
		Disease d2 = new Disease();
		assertEquals(d1.hashCode(), d2.hashCode());
	}
	
	@Order(6)  
	@Test
	public void EqualsCondition1() {
		Disease d2=d1;
		assertTrue(d1.equals(d2));
	}
	
	@Order(7)  
	@Test
	public void EqualsCondition2() {
		Disease d1 = null;
		Disease d2=DiseaseTest.d1;
		assertFalse(d2.equals(d1));
	}
	
	@Order(8)  
	@Test
	public void EqualsCondition3() {
		Disease d1 = new Disease();
		Disease d2 = new Disease();
		d2.setDiseaseId(new UUID(1,1));
		assertFalse(d1.equals(d2));
	}
	
	@Order(9)  
	@Test
	public void EqualsCondition4() {
		Disease d1 = new Disease();
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 = new Disease();
		d2.setDiseaseId(new UUID(1,2));
		assertFalse(d1.equals(d2));
	}
	
	@Order(10)  
	@Test
	public void EqualsCondition5() {
		Disease d1 = new Disease();
		d1.setDiseaseId(new UUID(1,1));
		Disease d2 = new Disease();
		d2.setDiseaseId(new UUID(1,1));
		assertTrue(d1.equals(d2));
	}
	@Order(11)  
	@Test
	public void EqualsCondition6() {
		Disease d1 = new Disease();
		d1.setDiseaseId(new UUID(1,1));
		
		assertFalse(d1.equals("Kamal"));
	}
	@Order(12)  
	@Test
	public void EqualsCondition7() {
		Disease d1 = new Disease();
		Disease d2 = new Disease();
		assertTrue(d1.equals(d2));
	}



	@Order(13)  
	@Test
	public void TOString() {
		
		UUID diseaseId = null;
		String name = null;
		Disease d1 = new Disease();
		String expected = "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
		String actual =d1.toString();
		assertEquals(expected, actual);
	
	}
	
}
