package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonsPage extends BasePage {
    private WebElement radioButtonsBtn;
    private WebElement yesBtn;
    private WebElement yesNote;
    private WebElement impressedBtn;
    private WebElement impressedNote;

    public RadioButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getRadioButtonsBtn() {
        radioButtonsBtn = getDriver().findElement(By.cssSelector("#item-2 > span"));
        return radioButtonsBtn;
    }

    public WebElement getYesBtn() {
        yesBtn = getDriver().findElement(By.xpath("//label[contains(text(),'Yes')]"));
        return yesBtn;
    }

    public WebElement getYesNote() {
        yesNote = getDriver().findElement(By.xpath("//span[contains(text(), 'Yes')]"));
        return yesNote;
    }

    public String getYesNoteText() {
        return getYesNote().getText();
    }

    public WebElement getImpressedBtn() {
        impressedBtn = getDriver().findElement(By.xpath("//label[contains(text(),'Impressive')]"));
        return impressedBtn;
    }

    public WebElement getImpressedNote() {
        impressedNote = getDriver().findElement(By.xpath("//span[contains(text(), 'Impressive')]"));
        return impressedNote;
    }

    public String getImpressedNoteText() {
        return getImpressedNote().getText();
    }
    public void clickRadioButtonsBtn() {
        getRadioButtonsBtn().click();
    }

    public void clickYesRadioButtonBtn() {
        clickRadioButtonsBtn();
        getYesBtn().click();
    }

    public void clickImpressedButtonBtn() {
        clickRadioButtonsBtn();
        getImpressedBtn().click();
    }
}

