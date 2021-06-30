package com.test.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Eclipse-New\\Ecommerce\\src\\test\\resources\\Feature\\AddCartFeature.feature",glue= {"com.test.stepdef"},monochrome=true,dryRun=false)
	public class TestRunnerClass {
}
