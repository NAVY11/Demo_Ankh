package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test11.
 */
public class Test11 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardAssassinationCard(7);
		assertTrue(isThisAssassinationCard);
	}

}
