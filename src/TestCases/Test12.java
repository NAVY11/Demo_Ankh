package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test12 {

	@Test
	public void test() {
		boolean isThisAssassinationCard = PresentationUtility.isThisGreenCardAssassinationCard(28);
		assertTrue(isThisAssassinationCard);
	}

}