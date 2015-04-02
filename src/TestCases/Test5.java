package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ViewFile.ViewFileTxt;

// TODO: Auto-generated Javadoc
/**
 * The Class Test5.
 */
public class Test5 {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		ViewFileTxt fileTxt = new ViewFileTxt();
		String outputPadding = fileTxt.paddingToMakeSixteen("NareshKumar");
		assertEquals("NareshKumar   ", outputPadding);

	}

}
