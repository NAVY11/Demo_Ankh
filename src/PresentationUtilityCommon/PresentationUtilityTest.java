package PresentationUtilityCommon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class PresentationUtilityTest.
 */
public class PresentationUtilityTest {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		// 1
		Boolean valueReturnValue = PresentationUtility.randomIntegerGenerator(1, 10);
		assertTrue(valueReturnValue);
		// 2
		Integer nextPlayerNumber = PresentationUtility.nextPlayerTurn(3, 4);
		assertSame(4, nextPlayerNumber);
		// 3
		ArrayList<Integer> initializedArray = PresentationUtility.initializeAArrayWithValue(3);
		ArrayList<Integer> expectedInitializedArray = new ArrayList<Integer>();
		expectedInitializedArray.add(1);
		expectedInitializedArray.add(2);
		expectedInitializedArray.add(3);
		
		Boolean arrayEqual = assertArrayEquals(initializedArray, expectedInitializedArray);
		assertEquals(true, arrayEqual);
		
		// 5
		HashMap<Integer, Boolean> initializedHashMap = PresentationUtility.initializeAHashmapWithValue(4);
		HashMap<Integer, Boolean> expectedInitializedHashMap = new HashMap<Integer, Boolean>();
		
		expectedInitializedHashMap.put(1, false);
		expectedInitializedHashMap.put(2, false);
		expectedInitializedHashMap.put(3, false);
		assertEquals(expectedInitializedHashMap.toString(), initializedHashMap.toString());
		
	}

	/**
	 * Assert array equals.
	 *
	 * @param initializedArray the initialized array
	 * @param expectedInitializedArray the expected initialized array
	 * @return the boolean
	 */
	private Boolean assertArrayEquals(ArrayList<Integer> initializedArray, ArrayList<Integer> expectedInitializedArray) {
		// for 3
		
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
