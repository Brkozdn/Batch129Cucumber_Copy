package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DemoStepDefinition {

    DemoPage demoPage = new DemoPage();

    @Given("Kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


    @And("Username kutucuguna dogru {string} girilir")
    public void usernameKutucugunaDogruGirilir(String username) {

        demoPage.userName.sendKeys(ConfigReader.getProperty(username));

    }

    @Then("Password kutucuguna dogru {string} girilir")
    public void passwordKutucugunaDogruGirilir(String password) {

        demoPage.password.sendKeys(ConfigReader.getProperty(password));

    }

    @And("Login butonuna tiklanir")
    public void loginButonunaTiklanir() {

        demoPage.login.click();

    }

    @And("Sayfaya erisilebildigi test edilir")
    public void sayfayaErisilebildigiTestEdilir() {

       String demoUrl = Driver.getDriver().getCurrentUrl();
       Assert.assertTrue(demoUrl.contains("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));


    }
}
