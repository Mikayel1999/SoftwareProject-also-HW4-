package event;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventReporter implements WebDriverEventListener

{
    public static void waitForVisibility(WebDriver driver, final By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForClickable(WebDriver driver, final By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForVisibilitySec(WebDriver driver, final By by, long sec) {
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void beforeAlertAccept(WebDriver webDriver)
    {

    }

    public void afterAlertAccept(WebDriver webDriver)
    {

    }

    public void afterAlertDismiss(WebDriver webDriver)
    {

    }

    public void beforeAlertDismiss(WebDriver webDriver)
    {

    }

    public void beforeNavigateTo(String s, WebDriver webDriver)
    {

    }

    public void afterNavigateTo(String s, WebDriver webDriver)
    {

    }

    public void beforeNavigateBack(WebDriver webDriver)
    {

    }


    public void afterNavigateBack(WebDriver webDriver)
    {

    }


    public void beforeNavigateForward(WebDriver webDriver)
    {

    }


    public void afterNavigateForward(WebDriver webDriver)
    {

    }


    public void beforeNavigateRefresh(WebDriver webDriver)
    {

    }


    public void afterNavigateRefresh(WebDriver webDriver)
    {

    }


    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver)
    {
        WebElement element = webDriver.findElement(by);
        try
        {
            String id = element.getAttribute("id");
            String className = element.getAttribute("class");
            if (!id.trim().equals(""))
                System.out.println("id " + id);
            else if (!className.trim().equals(""))
                System.out.println("class name is" + className);
        } catch (NullPointerException ignored)
        {
        }

    }


    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver)
    {
        // System.out.println("The Element " + webElement.getAttribute("id") + " was found.");
    }


    public void beforeClickOn(WebElement webElement, WebDriver webDriver)
    {
        System.out.println("clicked on " + webElement.getText());
    }


    public void afterClickOn(WebElement webElement, WebDriver webDriver)
    {

    }


    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences)
    {

    }


    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences)
    {

    }


    public void beforeScript(String s, WebDriver webDriver)
    {

    }


    public void afterScript(String s, WebDriver webDriver)
    {

    }


    public void beforeSwitchToWindow(String s, WebDriver webDriver)
    {

    }


    public void afterSwitchToWindow(String s, WebDriver webDriver)
    {

    }


    public void onException(Throwable throwable, WebDriver webDriver)
    {

    }


    public <X> void beforeGetScreenshotAs(OutputType<X> outputType)
    {

    }


    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x)
    {

    }


    public void beforeGetText(WebElement webElement, WebDriver webDriver)
    {

    }


    public void afterGetText(WebElement webElement, WebDriver webDriver, String s)
    {

    }
}
