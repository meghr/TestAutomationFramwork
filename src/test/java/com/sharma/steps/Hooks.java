package com.sharma.steps;

import com.sharma.testbase.BaseClass;
import com.sharma.utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start() {
		BaseClass.setUp();
	}

	@After
	public void end(Scenario scenario) {

		byte[] picture;

		if (scenario.isFailed()) {
			// take screenshot and save it in /failed
			picture = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		} else {
			// take screenshot and put it in /passed folder
			picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(picture, "image/png", scenario.getName());

		BaseClass.tearDown();
	}

}
