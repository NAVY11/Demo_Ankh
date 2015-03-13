package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test19.
 */
public class Test19 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Integer amountToBeReturned = PresentationUtility.howMuchMoneyToTakeFromBank("g7");
		assertEquals(amountToBeReturned.toString(), new String("2"));
	}

}
