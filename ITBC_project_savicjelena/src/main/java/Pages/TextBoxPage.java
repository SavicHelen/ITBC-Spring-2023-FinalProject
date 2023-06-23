package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage{

    private WebElement userNameField;
    private WebElement emailField;
    private WebElement currentAddress;
    private WebElement permanentAddress;
    private WebElement submitBtn;
    private WebElement submittedText;
    private WebElement eMailErrorNote;
public TextBoxPage (WebDriver driver, WebDriverWait wait) {

    super(driver, wait);
}

    public WebElement getUserNameField() {
        WebElement userNameField = getDriver().findElement(By.id("userName"));
        return userNameField;
    }

    public WebElement getEmailField() {
        WebElement emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getCurrentAddress() {
        WebElement currentAddress = getDriver().findElement(By.id("currentAddress"));
        return currentAddress;
    }

    public WebElement getPermanentAddress() {
        WebElement permanentAddress = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddress;
    }

    public WebElement getSubmitBtn() {
        WebElement submitBtn = getDriver().findElement(By.id("submit"));             //(By.xpath("//*[@id='output']/div"));
        return submitBtn;
    }

    public WebElement getSubmittedText() {
        WebElement submittedText = getDriver().findElement(By.id("output"));              //className("border col-md-12 col-sm-12"));
        return submittedText;
    }
    public WebElement getEMailErrorNote(){
    WebElement eMailErrorNote=getDriver().findElement(By.className ("mr-sm-2 field-error form-control"));
    return eMailErrorNote;
    }

    public TextBoxPage enterUsernameField (String text){
        /*getWait().until(ExpectedConditions.elementToBeClickable(userNameField));*/
        getUserNameField().sendKeys(text);
        return this;
    }

    public TextBoxPage enterEmailField (String email){
       // getWait().until(ExpectedConditions.elementToBeClickable(emailField));
        getEmailField().sendKeys(email);
        return this;
    }
    public TextBoxPage enterCurrentAddress (String address){
      //  getWait().until(ExpectedConditions.elementToBeClickable(currentAddress));
        getCurrentAddress().sendKeys(address);
        return this;
    }

    public TextBoxPage enterPermanentAddress (String address){
      //  getWait().until(ExpectedConditions.elementToBeClickable(permanentAddress));
        getPermanentAddress().sendKeys(address);
        return this;
    }

    public void clickSubmitBtn (){
        getSubmitBtn().click();
    }
}
