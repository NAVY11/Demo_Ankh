package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test8.
 */
public class Test8 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean canMinionBePlaced = PresentationUtility.canMinionBePlacedInAdjacentArea(2, 206, 6, 4);
		assertTrue(canMinionBePlaced);
	}

}
