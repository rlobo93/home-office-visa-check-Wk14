package gov.uk.check.visa.testng;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testsuite.VisaConfirmationTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestNGGrouping extends VisaConfirmationTest {

    VisaConfirmationTest visaConfirmationTest ;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        visaConfirmationTest = new VisaConfirmationTest();
    }





}
