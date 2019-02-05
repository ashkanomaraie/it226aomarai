package edu.isu.it226;

/**
 * Use this class for making multiple commits. For example,
 * fill in each function and make a commit
 * @author rsaripa
 *
 */

public class GitDemo {

	
	
	public int getFibonacci(int value){
		/**
		 * Write the logic for obtaining the results for
		 * Fibonacci of "Value". Change the return value
		 */

		if (value<=1)
			return value;
		
		return getFibonacci(value-1) + getFibonacci(value-2);
	}
	
	/**
	 * Please add any other two functions.
	 */
}