package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test21.
 */
public class Test21 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Integer amountToBeReturned = PresentationUtility.howMuchMoneyToTakeFromBank("g94");
		assertEquals(amountToBeReturned.toString(), new String("0"));
	}

}
