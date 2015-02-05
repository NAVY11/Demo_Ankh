package ViewFile;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewFileAmbgTest {

	@Test
	public void test() {
		// 4
		ViewFileAmbg fileAmbg = new ViewFileAmbg();
		String outputPadding = fileAmbg.paddingToMakeSixteen("NareshKumar");
		assertEquals("NareshKumar     ", outputPadding);
	}
}
