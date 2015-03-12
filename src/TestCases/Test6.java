package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test6 {

	@Test
	public void test() {
		boolean canMinionBePlaced = PresentationUtility.canMinionBePlacedInAdjacentArea(2, 201, 5, 8);
		assertTrue(canMinionBePlaced);
	}

}
