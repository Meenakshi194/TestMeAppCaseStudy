package AddToCartScenario;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin={"pretty","junit:DemoAddToCart.xml"})
public class AddToCart_Runner {

}
