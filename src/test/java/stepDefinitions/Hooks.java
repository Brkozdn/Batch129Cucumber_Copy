package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
// failed olan raporun fotografını görüntüleyebilmek için
    @After
    public void tearDown(Scenario scenario){

    final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

    if(scenario.isFailed()){
        scenario.attach(screenshot,"image/png","screenshots");

    }

      Driver.closeDriver();


    }
}
