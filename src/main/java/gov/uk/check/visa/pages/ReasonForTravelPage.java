package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[contains(text(),'Tourism')]")
    WebElement tourism;

    @FindBy(xpath = "//label[contains(text(),'Work, academic visit or business')]")
    WebElement workAcademic;

    @FindBy(xpath = "//label[contains(text(),'Join partner or family for a long stay')]")
    WebElement joinFamily;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAfterReason;

    @FindBy()
    WebElement reasonForVisitList;

    public void selectReasonForVisit(String reason) {
        clickOnElement(By.xpath("//div[@id='current-question']//label[contains(.,'" + reason + "')]"));
    }

    public void clickNextStepButton(){
        clickOnElement(continueAfterReason);
    }


}
