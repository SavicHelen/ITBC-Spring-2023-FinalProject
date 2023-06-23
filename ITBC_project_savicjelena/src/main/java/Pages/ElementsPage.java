package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsPage extends BasePage {
    private WebElement elementsCard;
    private WebElement elementsMenuShow;
    private WebElement textBoxBtn;


    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getElementsCard() {
        elementsCard=getDriver().findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)"));
        return elementsCard;
    }

    public WebElement getElementsMenuShow() {
        elementsMenuShow=getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]"));
        return elementsMenuShow;
    }

    public WebElement getTextBoxBtn() {
        textBoxBtn=getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]"));
        return textBoxBtn;
    }

    public void open() {
        getDriver().get("https://demoqa.com");
    }
    public boolean checkUrl(String text) {
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        return getDriver().getCurrentUrl().contains(text);
    }
    public void clickElementsCard (){
        getElementsCard().click();
    }
    public void clickElementsMenuShow (){
        getElementsMenuShow().click();
    }
    public void clickTextBoxBtn (){
        getTextBoxBtn().click();
    }



}
