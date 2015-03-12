package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test17 {

	@Test
	public void test() {
		boolean isThisRandomCard = PresentationUtility.isThisGreenCardRandomEventCard(39);
		assertTrue(isThisRandomCard);
	}

}
