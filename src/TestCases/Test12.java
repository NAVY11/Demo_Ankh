package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test12.
 */
public class Test12 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardAssassinationCard(28);
		assertTrue(isThisAssassinationCard);
	}

}
