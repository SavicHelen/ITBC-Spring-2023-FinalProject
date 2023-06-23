package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonsTests extends BaseTest{

    @Test
    public void verifyRadioButtonOptionYesClickable(){
        getElementsPage().clickElementsCard();
        getRadioButtonsPage().clickYesRadioButtonBtn();
        Assert.assertEquals(getRadioButtonsPage().getYesNoteText(), "Yes");
    }

    @Test
    public void verifyRadioButtonOptionImpressedClickable(){
      getElementsPage().clickElementsCard();
      getRadioButtonsPage().clickImpressedButtonBtn();
      Assert.assertEquals(getRadioButtonsPage().getImpressedNoteText(), "Impressive");

    }
}
