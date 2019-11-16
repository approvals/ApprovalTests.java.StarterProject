package org.samples;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.approvaltests.Approvals;
import org.junit.Test;
import org.lambda.query.Query;

import com.spun.util.StringUtils;
import com.spun.util.io.FileUtils;

public class SampleTests {
	@Test
	public void testNormalJunit() {
		assertEquals(5, 5);
	}

	@Test
	public void testWithApprovalTests() {
		int sc = 225;
		Approvals.verify("Hello World");
	}

	/**
	 * note: this requires GSON which is currently added in the pom.xml file.
	 * This is only required if you want to use the VerifyAsJson.
	 **/
	@Test
	public void testJson() {
		Person hero = new Person("jayne", "cobb", true, 38);
		Approvals.verifyAsJson(hero);
	}

	@Test
	public void testName() throws Exception {
		String file = "/Users/llewellyn/GitHub/MobProgrammingFacilitatorsGuide/MobProgrammingFacilitorsGuide_English.md";
		String text = FileUtils.readFile(file);
		String[] lines = text.split("\\\n");
		List<String> checklist = Query.where(lines, l -> l.trim().startsWith("* [ ] ") || l.trim().startsWith("## "));
		String output = StringUtils.join(checklist, "\n");
		File outputFile = new File(file.replaceAll("\\.md", "\\.checklist\\.md"));
		FileUtils.writeFile(outputFile, output);
		// TestUtils.displayFile(outputFile.getAbsolutePath());
	}
}
