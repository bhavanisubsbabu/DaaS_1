/**
 * 
 */
package utils;

import baseFile.BaseFile;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;


public class SeleniumWait extends BaseFile {
    FluentWait<WebDriver> wait = new FluentWait(web_driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(ElementNotFoundException.class).ignoring(ElementNotVisibleException.class);


	public FluentWait<WebDriver> timeOutWithMessage(String message) throws InterruptedException {

		return wait.withMessage(message);

	}

	public void waitforAlertisPresent() throws InterruptedException {

		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void  waitforTitletoBePresent(String title) throws InterruptedException {

		wait.until(ExpectedConditions.titleIs(title));

	}

	public void waitforelementToBeSelected(By objectName) {

		wait.until(ExpectedConditions.elementToBeSelected(objectName));
	}

	public WebDriver waitforframeToBeAvailableAndSwitchTo(By objectName) {

		return (WebDriver) wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(objectName));
	}

	public void waitforstaleness(WebElement objectName) {

		wait.until(ExpectedConditions.stalenessOf(objectName));

	}

	public void waitforpresenceOfElement(By objectName) {

		wait.until(ExpectedConditions.presenceOfElementLocated(objectName));

	}

	public void waitforPagetoLoad(int time, String title) {

		wait.until(ExpectedConditions.titleIs(title));
	}

	public void pause(double secondsToWait) {
		try {
			Thread.sleep((int) (secondsToWait * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitforElementtobeClickable(int time, By objectName) {

		wait.until(ExpectedConditions
				.elementToBeClickable(objectName));
	}

	public void waitforElementtobeClickable(int time, WebElement objectName) {

		wait.until(ExpectedConditions
				.elementToBeClickable(objectName));
	}

	public void waitforpresenceOfElements(By objectName) {

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(objectName));

	}


}
