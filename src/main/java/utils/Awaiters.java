package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
/* import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; */

public class Awaiters {

    public static void waitForAppear(
        WebDriver driver,
        By locatorToWaitForElementAppear
    ) {
        try {
            driver.findElement(locatorToWaitForElementAppear);
        } catch (TimeoutException ignored) {}
    }

    /* public static void waitForUpdate(
        WebDriver driver,
        WebElement elementToWaitForUpdate,
        long timeOutInSeconds
    ) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        try {
            wait.until(ExpectedConditions.stalenessOf(elementToWaitForUpdate));
        } catch (TimeoutException ignored) {}
    }

    public static void performAndWaitForUpdate(
        WebDriver driver,
        Runnable actionToPerform,
        WebElement elementToWaitForUpdate,
        long timeOutInSeconds
    ) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        actionToPerform.run();
        waitForUpdate(driver, elementToWaitForUpdate, timeOutInSeconds);
    }

    public static void performAndWaitForUpdate(
        WebDriver driver,
        Runnable actionToPerform,
        By locatorToWaitForElementUpdate,
        long timeOutInSeconds
    ) {
        WebElement elementToWaitForUpdate = driver.findElement(locatorToWaitForElementUpdate);
        performAndWaitForUpdate(driver, actionToPerform, elementToWaitForUpdate, timeOutInSeconds);
    } */
}
