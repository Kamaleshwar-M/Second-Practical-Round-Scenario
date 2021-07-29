package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
		Configuration configuration = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"), "SauceDemoAutomation");
		configuration.addClassifications("Browser","Chrome Browser");
		configuration.addClassifications("OS","Windows 10");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();
		
	}

}
