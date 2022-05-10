package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FamilyImmigrationStatusPage extends Utility {

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='current-question']//div[@class='gem-c-radio govuk-radios__item']/input[@id='response-0']")
    WebElement yesRB;

    @FindBy(css = "#response-1")
    WebElement noRB;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement next;

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                clickOnElement(yesRB);
                break;
            case "no":
                clickOnElement(noRB);
                break;
            default:
                System.out.println("Please select an option");
        }
    }

    public void clickOnContinue() {
        clickOnElement(next);
    }




}
