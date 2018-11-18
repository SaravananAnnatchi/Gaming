package hm.com.Utilities;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\NetEnt\\src\\test\\java\\Features\\defaultSlotMachine.feature",glue = "StepDefination"
                    ,monochrome = true, strict = true,format = {"pretty", "html:test-output"})
public class TestRunner {
}
