package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FacebookPage;

public class FacebookStepDefinitions {

    FacebookPage facebookPage = new FacebookPage();

    @Then("email kutusuna yanlis {string} girer")
    public void email_kutusuna_yanlis_girer(String yanlisEmail) {
      facebookPage.emailKutusu.sendKeys(yanlisEmail);
    }
    @Then("sifre kutusuna yanlis {string} girer")
    public void sifre_kutusuna_yanlis_girer(String yanlisSifre) {
        facebookPage.sifreKutusu.sendKeys(yanlisSifre);
    }
    @Then("giris yap butonuna tikar")
    public void giris_yap_butonuna_tikar() {
        facebookPage.giriYapButonu.click();
    }
    @Then("girdigin sifre yanlis yazi elementinin gorunur oldugunu test eder")
    public void girdigin_sifre_yanlis_yazi_elementinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(facebookPage.girdiginSifreYanlisYaziElementi.isDisplayed());
    }



}
