package TestCases;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test2.
 */
public class Test2 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Integer nextPlayerNumber = PresentationUtility.nextPlayerTurn(3, 4);
		assertSame(4, nextPlayerNumber);
	}

}
