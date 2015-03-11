package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test14 {

	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardPlacingAMinionCard(44);
		assertTrue(isThisAssassinationCard);
	}

}
