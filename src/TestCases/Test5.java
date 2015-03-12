package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ViewFile.ViewFileTxt;

public class Test5 {

	@Test
	public void test() {
		ViewFileTxt fileTxt = new ViewFileTxt();
		String outputPadding = fileTxt.paddingToMakeSixteen("NareshKumar");
		System.out.print(outputPadding);
		assertEquals("NareshKumar   ", outputPadding);

	}

}
