package com.srinimarva.overstock.runner.customer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue={"com.srinimarva.overstock.stepdefs.common","com.srinimarva.overstock.stepdefs.customer"},
format={"pretty","json:target/cucumber.json"},
tags={"@SignIn,@ForgotPassword,@ChangePassword"})
public class RunnerATTest {

}
