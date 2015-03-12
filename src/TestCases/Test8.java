package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test8 {

	@Test
	public void test() {
		boolean canMinionBePlaced = PresentationUtility.canMinionBePlacedInAdjacentArea(2, 206, 6, 4);
		assertTrue(canMinionBePlaced);
	}

}
