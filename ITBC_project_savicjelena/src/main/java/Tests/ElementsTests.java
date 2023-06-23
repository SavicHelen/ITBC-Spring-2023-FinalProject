package Tests;

import Pages.ElementsPage;
import Pages.RadioButtonsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTests extends BaseTest {

    @Test
    public void verifyElementsIsClicked (){
        getElementsPage().clickElementsCard();
        Assert.assertTrue(getElementsPage().checkUrl("elements"));
    }
    @Test
    public void verifyTextBoxFeatureClosesAfterClickingCollapseButton() {
        getElementsPage().clickElementsCard();
        getElementsPage().clickElementsMenuShow();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getElementsPage().getElementsMenuShow())).isDisplayed());
    }
    @Test
    public void verifyTextBoxFeatureWillAppearAfterClickingTextBoxButton () {
        getElementsPage().clickElementsCard();
        getElementsPage().clickTextBoxBtn();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getElementsPage().getTextBoxBtn())).isDisplayed());
        Assert.assertTrue(getElementsPage().checkUrl("text-box"));
    }

}


