package com.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/automation/features",
        glue = "com.automation.stepdefinition",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        publish=true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}