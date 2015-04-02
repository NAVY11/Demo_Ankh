package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ankhmorpork.Game.Game;

public class Test23 {

	@Test
	public void test() {
		String adjacentList = Game.getAdjacentAreas(5);
		assertEquals(adjacentList,"4,6,7,8,10");
	}

}
