package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test14.
 */
public class Test14 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardPlacingAMinionCard(44);
		assertTrue(isThisAssassinationCard);
	}

}
