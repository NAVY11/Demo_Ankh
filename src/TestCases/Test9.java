package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test9.
 */
public class Test9 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Integer currentPlayerPlaying = PresentationUtility.nextPlayerTurn(2, 2);
		assertEquals(currentPlayerPlaying.toString(), new String("1"));
	}

}
