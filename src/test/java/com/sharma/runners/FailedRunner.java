package com.sharma.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "@target/failed.txt",
			glue = "com.neotech.steps",
			plugin = {"pretty"}
		)
public class FailedRunner {

}
