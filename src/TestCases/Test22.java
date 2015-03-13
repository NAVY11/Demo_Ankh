package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ankhmorpork.GameObjects.Player;

// TODO: Auto-generated Javadoc
/**
 * The Class Test22.
 */
public class Test22 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Player player = new Player();
		String updatedString = player.removeOneCardFromCommaSeparatedString(new String("1,2,3,4,5"), new String("3"));
		System.out.print(updatedString);
		assertEquals(updatedString, new String("1,2,4,5"));
	}

}
