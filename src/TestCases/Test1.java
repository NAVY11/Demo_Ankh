package TestCases;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test1.
 */
public class Test1 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Boolean valueReturnValue = PresentationUtility.randomIntegerGenerator(1, 10);
		assertTrue(valueReturnValue);
	} 

}
