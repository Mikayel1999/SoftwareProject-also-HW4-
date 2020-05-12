package pages;

import event.EventReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    private final By username = By.id("PH_user-email");
    private final By personalData = By.cssSelector("#PH\\:authMenu\\:activeAccountLinks > a:nth-child(2) > span");
    private final By name = By.id("firstname");
    private final By surname = By.id("lastname");
    private final By nickname = By.id("nickname");
    private final By personalDataPage = By.cssSelector("#root > div > div.Layout-mobile__container--2MbDy > div > div > h1");
    private final By gamePage = By.cssSelector("#portal-headline > table > tbody > tr > td.w-x-ph__col.w-x-ph__col_left > a:nth-child(5) > span");


    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getUsername() {
        EventReporter.waitForVisibility(driver, username);
        return driver.findElement(username).getText();

    }

    public void clickUsername() {
        EventReporter.waitForClickable(driver, username);
        driver.findElement(username).click();
    }

    public void clickPersonalData() {
        EventReporter.waitForClickable(driver, username);
        driver.findElement(personalData).click();
    }

    public String getNameFromPersonalData() {
        return driver.findElement(name).getAttribute("value");
    }

    public String getSurnameFromPersonalData() {
        return driver.findElement(surname).getAttribute("value");
    }

    public String getNicknameFromPersonalData() {
        return driver.findElement(nickname).getAttribute("value");
    }

    public String personalDataPage() {
        EventReporter.waitForVisibility(driver, personalDataPage);
        return driver.findElement(personalDataPage).getText();
    }

    public void goGamePage() {
        driver.findElement(gamePage).click();
    }

}
