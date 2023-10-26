package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Then("{string} basligi altindaki tum degerleri yazdirir")
    public void basligi_altindaki_tum_degerleri_yazdirir(String istenenbaslikIsmi) {

        int istenenSutunBaslikidx=0;


        for (int i = 0; i <guruPage.sutunBasliklari.size() ; i++) {

            if(guruPage.sutunBasliklari.get(i).getText().equals(istenenbaslikIsmi)){
                istenenSutunBaslikidx=i;
            }
        }




        List<WebElement> sutunElementleri =
          Driver.getDriver().findElements(By.xpath("(//table)[2]//tbody//tr//td["+(istenenSutunBaslikidx+1)+"]"));

        for (WebElement each :sutunElementleri) {
            System.out.println(each.getText());

        }




    }



}
