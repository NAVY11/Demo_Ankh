package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test21 {

	@Test
	public void test() {
		Integer amountToBeReturned = PresentationUtility.howMuchMoneyToTakeFromBank(94);
		assertEquals(amountToBeReturned.toString(), new String("0"));
	}

}
