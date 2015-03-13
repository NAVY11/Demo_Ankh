package TestCases;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

// TODO: Auto-generated Javadoc
/**
 * The Class Test3.
 */
public class Test3 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		ArrayList<Integer> initializedArray = PresentationUtility.initializeAArrayWithValue(3);
		ArrayList<Integer> expectedInitializedArray = new ArrayList<Integer>();
		expectedInitializedArray.add(1);
		expectedInitializedArray.add(2);
		expectedInitializedArray.add(3);
		
		Boolean arrayEqual = assertArrayEquals(initializedArray, expectedInitializedArray);
		assertEquals(true, arrayEqual);
		
	}
	
	/**
	 * Assert array equals.
	 *
	 * @param initializedArray the initialized array
	 * @param expectedInitializedArray the expected initialized array
	 * @return the boolean
	 */
	private Boolean assertArrayEquals(ArrayList<Integer> initializedArray, ArrayList<Integer> expectedInitializedArray) {
		return compareList(initializedArray, expectedInitializedArray);
	}
	
	/**
	 * Compare list.
	 *
	 * @param ls1 the ls1
	 * @param ls2 the ls2
	 * @return true, if successful
	 */
	public static boolean compareList(List ls1,List ls2){
        return ls1.toString().contentEquals(ls2.toString())?true:false;
    }

}
