package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test18 {

	@Test
	public void test() {
		Integer amountToBeReturned = PresentationUtility.howMuchMoneyToTakeFromBank(47);
		assertEquals(amountToBeReturned.toString(), new String("1"));
	}

}
