package TestCases;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test2 {

	@Test
	public void test() {
		Integer nextPlayerNumber = PresentationUtility.nextPlayerTurn(3, 4);
		assertSame(4, nextPlayerNumber);
	}

}
