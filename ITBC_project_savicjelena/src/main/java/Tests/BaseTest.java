package Tests;

import Pages.ElementsPage;
import Pages.RadioButtonsPage;
import Pages.TextBoxPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private ElementsPage elementsPage;
    private RadioButtonsPage radioButtonsPage;
    private TextBoxPage textBoxPage;
    private JavascriptExecutor js;

    public WebDriver getDriver(){
        return driver;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public ElementsPage getElementsPage() {
        return elementsPage;
    }
    public RadioButtonsPage getRadioButtonsPage() { return radioButtonsPage;}
    public TextBoxPage getTextBoxPage(){return textBoxPage;}

    public JavascriptExecutor getJs() {
        return js;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver.exe","C://Users//Jeka//Desktop//DRIVER//chromedriver_win32.exe");
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        js=(JavascriptExecutor) driver;
        elementsPage=new ElementsPage(driver,wait);
        radioButtonsPage=new RadioButtonsPage(driver,wait);
        textBoxPage = new TextBoxPage(driver, wait);

    }
   @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().open();
        getDriver().manage().window().fullscreen();
    }
    @AfterClass
    public void cleanUp(){
        getDriver().close();
    }


}
