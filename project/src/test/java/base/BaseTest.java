package base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import org.testng.annotations.AfterMethod;
import pages.GamePage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    private static WebDriver driver;
    protected LoginPage loginPage;
    protected MainPage mainPage;
    protected GamePage gamePage;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/miqayelmiqayel/Downloads/JUnit Project/CS230_AUA_JUnit/Driver/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://mail.ru/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        gamePage = new GamePage(driver);
    }


    @AfterMethod
    public static void tearDown() {
        driver.quit();
    }
}
