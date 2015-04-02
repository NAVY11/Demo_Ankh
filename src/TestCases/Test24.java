package TestCases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test24.
 */
public class Test24 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
	        assertTrue(PresentationUtility.isFileNameValid(" test.txt"));
	        assertTrue(PresentationUtility.isFileNameValid("test.txt"));
	        assertTrue(PresentationUtility.isFileNameValid("test123.txt"));
	        assertTrue(PresentationUtility.isFileNameValid("test_.txt"));
	        assertFalse(PresentationUtility.isFileNameValid(" "));
	}

}
