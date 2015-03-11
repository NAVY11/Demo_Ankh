package TestCases;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import PresentationUtilityCommon.PresentationUtility;

public class Test4 {

	@Test
	public void test() {
		HashMap<Integer, Boolean> initializedHashMap = PresentationUtility.initializeAHashmapWithValue(4);
		HashMap<Integer, Boolean> expectedInitializedHashMap = new HashMap<Integer, Boolean>();
		
		expectedInitializedHashMap.put(1, false);
		expectedInitializedHashMap.put(2, false);
		expectedInitializedHashMap.put(3, false);
		assertEquals(expectedInitializedHashMap.toString(), initializedHashMap.toString());
	}

}
