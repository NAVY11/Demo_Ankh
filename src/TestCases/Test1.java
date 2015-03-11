package TestCases;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test1 {

	@Test
	public void test() {
		Boolean valueReturnValue = PresentationUtility.randomIntegerGenerator(1, 10);
		assertTrue(valueReturnValue);
	} 

}
