package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test10.
 */
public class Test10 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Integer currentPlayerPlaying = PresentationUtility.nextPlayerTurn(1, 4);
		assertEquals(currentPlayerPlaying.toString(), new String("2"));
	}

}
