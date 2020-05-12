package pages;

import event.EventReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private final WebDriver driver;

    private final By email = By.xpath("//*[@id=\"mailbox:login\"]");
    private final By pass = By.xpath("//*[@id=\"mailbox:password\"]");
    private final By clickButton = By.xpath("//*[@id=\"mailbox:submit\"]/input");
    private final By erroMsg = By.id("mailbox:error");

    public final String username = "miq.mir.93";
    public final String password = "homework2020";

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


    public void setUsername(String username) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(email).sendKeys(username);
        driver.findElement(clickButton).click();

    }

    public void setPassword(String password) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(pass).sendKeys(password);
    }

    public void clickBtn() {
        driver.findElement(clickButton).click();
    }

    public String getErrorMsg() {
        EventReporter.waitForVisibility(driver, erroMsg);
        return driver.findElement(erroMsg).getText();

    }

    public String invalidLogin(String username, String password) {

        setUsername(username);
        setPassword(password);
        clickBtn();
        return getErrorMsg();
    }

    public void successLogin() {
        setUsername(username);
        setPassword(password);
        clickBtn();
    }


}