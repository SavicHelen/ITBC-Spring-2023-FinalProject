package Tests;

import Pages.TextBoxPage;
import javafx.scene.web.WebEngine;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest{
    private WebEngine js;

    @Test
    public void verifyIfValidDataEntryIsPossible() {
        getElementsPage().clickElementsCard();
        getElementsPage().clickTextBoxBtn();
        getTextBoxPage().enterUsernameField("John");
        getTextBoxPage().enterEmailField("something@ontheweblearning.com");
        getTextBoxPage().enterCurrentAddress("Blah blah");
        getTextBoxPage().enterPermanentAddress("Blah blah");
        getJs().executeScript("window.scrollBy(0, 500)");
        getTextBoxPage().clickSubmitBtn();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getTextBoxPage().getSubmittedText())).isDisplayed());
}
    @Test
    public void verifyIfInvalidDataEntryIsPossible() throws InterruptedException {
        getElementsPage().clickElementsCard();
        getElementsPage().clickTextBoxBtn();
        getTextBoxPage().enterUsernameField("#.*#*");
        getTextBoxPage().enterEmailField("#.*#*");
        getTextBoxPage().enterCurrentAddress("#.*#*");
        getTextBoxPage().enterPermanentAddress("#.*#*");
        getJs().executeScript("window.scrollBy(0, 500)");
        getTextBoxPage().clickSubmitBtn();
        Thread.sleep(3000);
        Assert.assertTrue(getWait().until(ExpectedConditions.invisibilityOf(getTextBoxPage().getSubmittedText())));

    }
}

