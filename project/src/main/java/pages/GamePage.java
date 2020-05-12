package pages;

import event.EventReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GamePage {
    private WebDriver driver;

    private final By logo = By.className("pm-logo__link__pic");
    private final By searchLogo = By.xpath("//*[@id=\"portal-menu__toolbar\"]/div/div/div[2]/div[1]/span/span/span[9]/span[2]/form/span[1]/span[1]/input");
    private final By searchInput = By.xpath("//*[@id=\"portal-menu__toolbar\"]/div/div/div[2]/div[1]/span/span/span[9]/span[2]/form/span[1]/span[1]/input");
    private final By search = By.xpath("//*[@id=\"portal-menu__toolbar\"]/div/div/div[2]/div[1]/span/span/span[9]/span[2]/form/span[2]/button");
    private final By gameName = By.xpath("//*[@id=\"js-pc__search-container\"]/div[1]/div/div[1]/a/span");


    public GamePage(WebDriver driver) {

        this.driver = driver;
    }


    public void clickSearchLogo() {
        driver.findElement(searchLogo).click();
    }

    public void search() {

        driver.findElement(search).click();
    }

    public String getLogoText() {
        EventReporter.waitForVisibility(driver, logo);
        return driver.findElement(logo).getAttribute("data-original-title");
    }

    public void setSearchingText(String text) {

        driver.findElement(searchInput).sendKeys(text);
    }

    public String getGameName() {
        EventReporter.waitForVisibilitySec(driver, gameName, 20);
        return driver.findElement(gameName).getText();
    }


}
