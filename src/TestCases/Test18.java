package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test18.
 */
public class Test18 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Integer amountToBeReturned = PresentationUtility.howMuchMoneyToTakeFromBank("g47");
		assertEquals(amountToBeReturned.toString(), new String("1"));
	}

}
