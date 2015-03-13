package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test7.
 */
public class Test7 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean canMinionBePlaced = PresentationUtility.canMinionBePlacedInAdjacentArea(1, 311, 10, 2);
		assertTrue(canMinionBePlaced);
	}

}
