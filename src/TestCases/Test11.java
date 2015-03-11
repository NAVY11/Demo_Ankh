package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test11 {

	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardAssassinationCard(7);
		assertTrue(isThisAssassinationCard);
	}

}
