package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {

    public WorkTypePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextPage;

    @FindBy()
    WebElement selectJobtypeList;

    public void selectJobType(String jobType){
        clickOnElement(By.xpath("//label[contains(text(),'" + jobType.toString() + "')]"));
    }

    public void clickNextStepButton(){
        clickOnElement(nextPage);
    }

}
