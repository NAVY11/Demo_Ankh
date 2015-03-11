package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test13 {

	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardPlacingAMinionCard(7);
		assertTrue(isThisAssassinationCard);
	}

}
