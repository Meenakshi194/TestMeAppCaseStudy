package Purchase;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,tags="@PurchasePass")//plugin={"pretty","junit:DemoPurchaseReport.xml"})
public class PurchaseRunner {

}
