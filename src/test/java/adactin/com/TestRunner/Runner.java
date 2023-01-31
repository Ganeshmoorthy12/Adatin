package adactin.com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\java\\Features",glue="adactin.com.Stepdefination",tags="@TC103")

public class Runner {

}
