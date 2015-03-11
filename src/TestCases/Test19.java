package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test19 {

	@Test
	public void test() {
		Integer amountToBeReturned = PresentationUtility.howMuchMoneyToTakeFromBank(7);
		assertEquals(amountToBeReturned.toString(), new String("2"));
	}

}
