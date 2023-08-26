package edu.disease.asn5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainerTest {
	Container<String> con;
	@Test
	void tes1() {
	
		assertThrows(IllegalArgumentException.class, ()->con = new Container<String>());
		
	}
	
	@Test
	void test2() {
	
		con = new Container<String>("kamal","raj");
		assertEquals(2, con.size());
		
	}
	
	@Test
	void test3() {
	
		con = new Container<String>("kamal","raj");
		assertEquals("kamal", con.get(0));
		
	}
	@Test
	void test4() {
	
		con = new Container<String>("kamal","raj");
		assertThrows(IllegalArgumentException.class,()-> con.get(3));
		
	}
	@Test
	void test5() {
	
		con = new Container<String>("kamal","raj");
		assertThrows(IllegalArgumentException.class,()-> con.get(-1));
		
	}

}
