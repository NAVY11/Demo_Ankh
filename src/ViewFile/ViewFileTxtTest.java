package ViewFile;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewFileTxtTest {

	@Test
	public void test() {
		// 4
		ViewFileTxt fileTxt = new ViewFileTxt();
		String outputPadding = fileTxt.paddingToMakeSixteen("NareshKumar");
		assertEquals("NareshKumar     ", outputPadding);
	}
}
