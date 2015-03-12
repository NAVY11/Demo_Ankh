package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test9 {

	@Test
	public void test() {
		Integer currentPlayerPlaying = PresentationUtility.nextPlayerTurn(2, 2);
		assertEquals(currentPlayerPlaying.toString(), new String("1"));
	}

}
