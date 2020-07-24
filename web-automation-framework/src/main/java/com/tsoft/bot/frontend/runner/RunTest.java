package com.tsoft.bot.frontend.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


@CucumberOptions(
		features={"src//main//resources//features"},
		glue={"com.tsoft.bot.frontend.steps.gestion","com.tsoft.bot.frontend.helpers"},
		plugin = {"pretty", "html:target/cucumber"},
		tags = {"@GESDATA_Extraer_Data_WEB_DCODE"},
		monochrome = true
	)

@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
