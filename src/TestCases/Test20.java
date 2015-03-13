package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test20.
 */
public class Test20 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Integer amountToBeReturned = PresentationUtility.howMuchMoneyToTakeFromBank("g40");
		assertEquals(amountToBeReturned.toString(), new String("5"));
	}

}
