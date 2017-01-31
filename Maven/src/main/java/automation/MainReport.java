package automation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class MainReport {
	public static void main(String[] s) {
		File reportOutputDirectory = new File("report");

		String buildNumber = "1";
		String projectName = "cucumberProject";
		boolean runWithJenkins = false;
		boolean parallelTesting = false;

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration
		configuration.setParallelTesting(parallelTesting);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);

		ReportBuilder reportBuilder = new ReportBuilder(getJsonFiles(), configuration);
		reportBuilder.generateReports();
	}

	public static List<String> getJsonFiles() {
		List<String> jsonFiles = new ArrayList<String>();
		try {
			File dir = new File("target//");
			if (!dir.isDirectory())
				throw new IllegalStateException("");
			for (File file : dir.listFiles()) {
				if (file.getName().startsWith("cucumber") && !file.isDirectory()) {
					System.out.println(file.getAbsolutePath());
					jsonFiles.add(file.getAbsolutePath());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonFiles;
	}
}
