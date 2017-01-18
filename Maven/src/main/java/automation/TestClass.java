package automation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class TestClass {
	public static void main(String[] args) throws IOException {
		List<String> lines = FileUtils.readLines(new File("target//cucumber.json"));
		System.out.println(lines.get(0));
	}
}
