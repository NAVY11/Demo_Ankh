package ViewFile;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewFileTxtTest {

	@Test
	public void test() {
		// 4
		ViewFileTxt fileAmbg = new ViewFileTxt();
		String outputPadding = fileAmbg.paddingToMakeSixteen("NareshKumar");
		assertEquals("NareshKumar     ", outputPadding);
	}
}
