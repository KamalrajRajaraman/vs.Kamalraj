package edu.disease.asn5;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * class Container can store multiple of items of varying types in a single
 * variable using Generic.
 *
 * 
 */
public class Container<T> {
	private List<T> t;

	/**
	 * The constructor accept all of the arguments to place in the Container and
	 * assign the arguments to a property on the class. The constructor allow any
	 * arbitrary number of arguments of any type and it enforce at least one
	 * argument to be supplied. Throw an IllegalArgumentException if no arguments
	 * were supplied.
	 * 
	 */
	public Container(T... t) {
		if (t.length == 0) {
			throw new IllegalArgumentException("No Arguments were supplied");
		}
		this.t = Arrays.asList(t);

	}

	/**
	 * The size method that returns an integer. The size method accept no arguments
	 * and return the number of values stored in the Container.
	 *
	 */
	public int size() {
		return t.size();
	}

	/**
	 * 
	 * The get method returns the value at the supplied index.The get method to
	 * defined as generic method with a generic type and then return the generic
	 * type. The method should throws an IllegalArgumentException if the supplied
	 * int value is an invalid index within our Container.
	 */
	public T get(int index) {
		if (index < 0 || index >= t.size()) {
			throw new IllegalArgumentException("Invalid Index");
		}
		return t.get(index);
	}

}
