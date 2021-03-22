package test_cucumber_suit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/test_cucumber_suit/universal.feature"},
        glue= {"test_cucumber_suit"},//package name
        tags= "@universalclass"
        
)
@RunWith(Cucumber.class)

public class Test_Runner_Uni 
{
	
}
