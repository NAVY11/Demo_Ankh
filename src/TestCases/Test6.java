package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test6.
 */
public class Test6 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		boolean canMinionBePlaced = PresentationUtility.canMinionBePlacedInAdjacentArea(2, 201, 5, 8);
		assertTrue(canMinionBePlaced);
	}

}
