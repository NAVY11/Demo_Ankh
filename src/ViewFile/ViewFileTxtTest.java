package ViewFile;

import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewFileTxtTest.
 */
public class ViewFileTxtTest {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		// 4
		ViewFileTxt fileTxt = new ViewFileTxt();
		String outputPadding = fileTxt.paddingToMakeSixteen("NareshKumar");
		assertEquals("NareshKumar     ", outputPadding);
	}
}
