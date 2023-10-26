package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {


    public GuruPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//table)[2]//thead//tr[1]//th")
    public List<WebElement> sutunBasliklari;


}
