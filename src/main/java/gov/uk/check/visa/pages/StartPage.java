package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptAdditionalCookies;

    @FindBy(xpath = "//a[contains(text(),'Start n')]")
    WebElement startNowButton;


    public void clickOnAcceptAdditionalCookiesButton(){
        Reporter.log("Clicking on " + acceptAdditionalCookies.getText() + "<br>");
        clickOnElement(acceptAdditionalCookies);
        //log.info("Clicking on accept additional cookies");
    }

    public void clickStartNow() {
        Reporter.log("Clicking on start button " + startNowButton.getText() + "<br>");
        clickOnElement(startNowButton);
        //log.info("Clicking on start now button");

    }
}
