package PresentationUtilityCommon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class PresentationUtilityTest {

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

	private Boolean assertArrayEquals(ArrayList<Integer> initializedArray, ArrayList<Integer> expectedInitializedArray) {
		// for 3
		
		return compareList(initializedArray, expectedInitializedArray);
	}
	
	public static boolean compareList(List ls1,List ls2){
        return ls1.toString().contentEquals(ls2.toString())?true:false;
    }


}
