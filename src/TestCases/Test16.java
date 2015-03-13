package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test16.
 */
public class Test16 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardPlacingABuildingCard(43);
		assertTrue(isThisAssassinationCard);
	}

}
