package TestCases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test24 {

	@Test
	public void test() {
	        assertTrue(PresentationUtility.isFileNameValid(" test.txt"));
	        assertTrue(PresentationUtility.isFileNameValid("test.txt"));
	        assertTrue(PresentationUtility.isFileNameValid("test123.txt"));
	        assertTrue(PresentationUtility.isFileNameValid("test_.txt"));
	        assertFalse(PresentationUtility.isFileNameValid(" "));
	}

}
