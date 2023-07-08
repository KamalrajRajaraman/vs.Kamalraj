package WhatHappens;

public class Derived {
		public void used() { 
			Base z = new Base(); 
			System.out.println("base says, " + z.Method()); 
		} 
		public static void main(String[] args) {
			Derived d1 = new Derived();
			d1.used();
		}
}
