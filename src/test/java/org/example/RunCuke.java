
package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@register or @referProduct or  @navigateDesktop or  @newReleaseComment", plugin =  { "pretty", "html:target/cucumber/report.html" } )

public class RunCuke {


}


