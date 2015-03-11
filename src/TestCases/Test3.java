package TestCases;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test3 {

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
	
	private Boolean assertArrayEquals(ArrayList<Integer> initializedArray, ArrayList<Integer> expectedInitializedArray) {
		return compareList(initializedArray, expectedInitializedArray);
	}
	
	public static boolean compareList(List ls1,List ls2){
        return ls1.toString().contentEquals(ls2.toString())?true:false;
    }

}
