package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import org.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile", glue = {
		"org.stepDefinition" }, monochrome = true, dryRun = false, plugin = { "pretty",
				"json:src\\test\\resources\\Reports\\report.json", "html:src\\test\\resources\\Reports\\report.html",
				"junit:src\\test\\resources\\Reports\\report.xml" })
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\report.json");

	}
}
