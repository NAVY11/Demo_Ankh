package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test15.
 */
public class Test15 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardPlacingABuildingCard(27);
		assertFalse(isThisAssassinationCard);
	}

}
