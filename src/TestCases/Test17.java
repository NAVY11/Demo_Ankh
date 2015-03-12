package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test17.
 */
public class Test17 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean isThisRandomCard = PresentationUtility.isThisGreenCardRandomEventCard(39);
		assertTrue(isThisRandomCard);
	}

}
