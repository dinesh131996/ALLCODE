package com.runner.org;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Mani\\eclipse-workspace\\U_Cucumber\\src\\test\\java\\com\\feature\\page.feature",
glue="com\\stepdef\\org",
tags = "@second"
		)

public class Runner {

	
}
