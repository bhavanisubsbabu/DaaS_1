/**
 *
 */
package utils;

import baseFile.BaseFile;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;


public class SeleniumUtils extends BaseFile {

    static Log log = LogFactory.getLog(SeleniumUtils.class);
    JavascriptExecutor js = (JavascriptExecutor) web_driver;
    Actions action = new Actions(web_driver);

    public void navigateTo(String URL) {
        web_driver.navigate().to(URL);
        web_driver.manage().window().maximize();

    }

    public String getUrl() {
        return web_driver.getCurrentUrl();
    }

    public String getText(String objectName) {
        By Element = getObject(objectName);

        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {
            return web_driver.findElement(Element).getText();
        }
        throw new NoSuchElementException("No such element Found on the webPage" + Element);

    }

    public String getText(By objectName) {
        seleniumWait.waitforpresenceOfElement(objectName);

        if (isElementPresent(objectName)) {
            return web_driver.findElement(objectName).getText();
        }
        throw new NoSuchElementException("No such element Found on the webPage" + objectName);


    }

    public List<WebElement> listWebElements(String objectName) {
        By Element = getObject(objectName);

        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {
            return web_driver
                    .findElements(Element);
        }
        throw new NoSuchElementException("No such element Found on the webPage" + Element);


    }

    public void clear(String objectName) {
        By Element = getObject(objectName);

        seleniumWait.waitforpresenceOfElement(Element);
        web_driver.findElement(Element).clear();

    }

    public void clear(By objectName) {
        seleniumWait.waitforpresenceOfElement(objectName);

        if (iselementvisible(objectName)) {
            web_driver.findElement(objectName).clear();
        } else {
            throw new NoSuchElementException("No such element Found on the webPage" + objectName);
        }
    }

    public void click(String objectName) {
        By Element = getObject(objectName);

        seleniumWait.waitforpresenceOfElement(Element);
        try {
            web_driver.findElement(Element).click();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("No such element Found on the webPage" + Element);
        }
    }


    public void click(By objectName) {

        seleniumWait.waitforpresenceOfElement(objectName);

        if (isElementPresent(objectName)) {

            seleniumWait.waitforElementtobeClickable(60, objectName);

            web_driver.findElement(objectName).click();
        }
        throw new NoSuchElementException("No such element Found on the webPage" + objectName);


    }

    public void click(WebElement element) {

        try {

            element.click();

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("No such element Found on the webPage" + element);
        }

    }

    public void clickOn(String jquery, int buttonPosition) {

        ArrayList<WebElement> ele = (ArrayList<WebElement>) getObjectFromJavascript(jquery);

        click(ele.get(buttonPosition));
    }

    public void clickOn(String elementName, String logmessage, String jquery) {

        ArrayList<WebElement> buttons = (ArrayList<WebElement>) getObjectFromJavascript(jquery);

        for (WebElement ele : buttons) {

            if (ele.getText().equalsIgnoreCase(elementName)) {

                ele.click();

                log.info(logmessage);

                break;
            }

        }
    }


    public void type(String text, String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        web_driver.findElement(Element)
                .sendKeys(text);
    }

    public void selectVisibleText(String text, String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        try {
            Select te = new Select(web_driver.findElement(Element));

            te.selectByVisibleText(text);

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("No such element Found on the webPage" + Element);
        }


    }

    public void selectByIndex(int text, String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {

            Select te = new Select(web_driver.findElement(Element));

            te.selectByIndex(text);

        } else {
            throw new NoSuchElementException("No such element Found on the webPage" + Element);
        }
    }

    public void selectByValue(String text, String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {

            Select te = new Select(web_driver.findElement(Element));

            te.selectByValue(text);

        } else {
            throw new NoSuchElementException("No such element Found on the webPage" + Element);
        }


    }

    public String getTextByAttributeName(String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {

            return web_driver.findElement(Element)
                    .getAttribute("name");

        }
        throw new NoSuchElementException("No such element Found on the webPage" + Element);

    }

    public String getTextByAttributevalue(String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {

            return web_driver.findElement(Element)
                    .getAttribute("value");

        }
        throw new NoSuchElementException("No such element Found on the webPage" + Element);


    }

    public String checkByAttributeChecked(String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {

            return web_driver.findElement(Element).getAttribute(
                    "checked");

        }
        throw new NoSuchElementException("No such element Found on the webPage" + Element);

    }

    public String getTextdByAttribute(String element, String attribute) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {

            return web_driver.findElement(Element)
                    .getAttribute(attribute);

        }
        throw new NoSuchElementException("No such element Found on the webPage" + Element);


    }

    public boolean isRadiobuttonSelected(String element) {
        By Element = getObject(element);
        seleniumWait.waitforpresenceOfElement(Element);
        if (isElementPresent(Element)) {

            return web_driver.findElement(Element)
                    .isSelected();

        }
        throw new NoSuchElementException("No such element Found on the webPage" + Element);

    }

    public Object executeJavascript(String javascriptExpression) {

        return js.executeScript(javascriptExpression);
    }


    public WebElement getWeblementFromJavascript(String javascriptExpression) {

        try {
            Object o = js.executeScript("return " + javascriptExpression);

            log.info("Javascript: " + javascriptExpression + " gives "
                    + (o == null ? null : o.toString()));
            return (WebElement) o;
        } catch (Exception e) {
            throw new RuntimeException("Unable to execute javascript: "
                    + javascriptExpression, e);
        }
    }

    public WebElement getWeblementBY(String element) {

        return (WebElement) getObject(element);

    }

    public WebElement getWeblement(String element) {

        return web_driver.findElement(getObject(element));

    }


    public Object getObjectFromJavascript(String javascriptExpression) {

        try {
            Object o = js.executeScript(javascriptExpression);

            log.info("Javascript: " + javascriptExpression + " gives "
                    + (o == null ? null : o.toString()));
            return o;
        } catch (Exception e) {
            throw new RuntimeException("Unable to execute javascript: "
                    + javascriptExpression, e);
        }
    }

    public String getStringFromJavascript(String javascriptExpression) {
        return (String) getObjectFromJavascript(javascriptExpression);
    }

    public boolean getBooleanFromJavascript(String javascriptExpression) {


        return (Boolean) getObjectFromJavascript(javascriptExpression);

    }

    public long getLongFromJavascript(String javascriptExpression) {
        Object o = getObjectFromJavascript(javascriptExpression);
        if (o instanceof Long)
            return (Long) o;
        return Long.parseLong((String) o);
    }

    public double getDoubleFromJavascript(String javascriptExpression) {
        return (Double) getObjectFromJavascript(javascriptExpression);
    }

    public void assertNoJavascriptErrorsOccurred() {
        long l = getLongFromJavascript("javascriptErrors.length");
        if (l == 0)
            return;
        String s = getStringFromJavascript("javascriptErrors[0]");

        fail(l + " javascript errors.  First error is " + s);
    }

    public void uploadfileBy_Name(String filePath) {
        // filePath = "path\\to\\file\for\\upload";
        JavascriptExecutor jsx = (JavascriptExecutor) web_driver;
        jsx.executeScript("document.getElementByname('data').value='"
                + or_.getProperty(filePath) + "';");
        if (true) {
            throw new IllegalArgumentException("Error in uploadfileName method");
        }
    }

    public boolean isElementPresent(String element) {
        seleniumWait.waitforpresenceOfElement(getObject(element));
        int count = web_driver.findElements(
                getObject(element)).size();
        if (count == 0)
            return false;
        else
            return true;
    }

    public boolean isElementPresent(By element) {
        int count = web_driver.findElements(element).size();
        if (count == 0)
            return false;
        else
            return true;
    }

    public boolean isElementDisplayed(String element) {

        return web_driver.findElement(getObject(element)).isDisplayed();

    }

    public boolean isElementDisplayed(By element) {

        return web_driver.findElement(element).isDisplayed();

    }

    public boolean isElementEnabled(String element) {

        return web_driver.findElement(getObject(element))
                .isEnabled();

    }

    public String getPageTitle() {

        return web_driver.getTitle();

    }

    public void swicthwindow(String franename, String element) {
        By Element = getObject(element);
        seleniumWait.waitforframeToBeAvailableAndSwitchTo(Element);
        web_driver.findElement(Element);
        web_driver.switchTo().frame(franename);

    }

    public void refreshPage() {
        web_driver.navigate().refresh();
    }

    public void navigatePageback() {
        web_driver.navigate().back();

    }

    public void navigatePageForward() {
        web_driver.navigate().forward();

    }

    public boolean iselementvisible(String element) {
        WebElement element1 = web_driver.findElement(getObject(element));
        if (element1 instanceof WebElement) {

            return true;
        } else {

        }
        return false;

    }

    public boolean iselementvisible(By element) {
        WebElement element1 = web_driver.findElement(element);
        if (element1 instanceof WebElement) {

            return true;
        } else {

        }
        return false;

    }

    public void scroll(WebElement elem) {
        js.executeScript("arguments[0].scrollIntoView()", elem);

    }

    public void takeScreenShot(String fileName) throws IOException {

        WebDriver augmentedDriver = new Augmenter().augment(web_driver);
        File screenshot = ((TakesScreenshot) augmentedDriver)
                .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screenshots" + File.separator
                + System.currentTimeMillis() + "_" + fileName + ".png"));

    }

    public void close() {
        web_driver.close();
        web_driver.quit();

    }

    public void dragElement(WebElement webElement, int xOffSet, int yOffSet) {

        Action dragAndRelease = action.clickAndHold(webElement)
                .moveByOffset(xOffSet, yOffSet).release().build();
        dragAndRelease.perform();

    }

    public void dragAndDropElement(WebElement webElement1, WebElement webElement2) {


        action.dragAndDrop(webElement1, webElement2).release(webElement2).release().build().perform();


    }


    public void typeAction(String element, String text) {

        action.sendKeys((WebElement) getObject(element), text).doubleClick().build().perform();

    }

    public void typeAction(WebElement element, String text) {

        action.sendKeys(element, text).doubleClick().build().perform();

    }

    public void clickAction(WebElement e) {

        action.moveToElement(e).click().
                release().build().perform();

    }

    public void DoubleClickAction(WebElement e) {

        action.moveToElement(e).doubleClick().
                release().build().perform();

    }

    public void clickElemenetByOffset(int x,int y) {

        action.moveByOffset(x, y).click().release().build().perform();

    }

    public void delete_Cookies() {
        web_driver.manage().deleteAllCookies();
    }

    public void maximizeBrowsersize() {

        web_driver.manage().window().maximize();
    }

    public By getObject(String element) {
        String locatorProperty = or_.getProperty(element);
        String locatorType = locatorProperty.split(":")[0];
        String locatorValue = locatorProperty.split(":")[1];

        By locator = null;
        switch (locatorType) {
            case "Id":
                locator = By.id(locatorValue);
                break;
            case "Name":
                locator = By.name(locatorValue);
                break;
            case "Class":
                locator = By.className(locatorValue);
                break;
            case "Css":
                locator = By.cssSelector(locatorValue);
                break;
            case "Link":
                locator = By.linkText(locatorValue);
                break;
            case "Partial":
                locator = By.partialLinkText(locatorValue);
                break;
            case "Tag":
                locator = By.tagName(locatorValue);
                break;
            case "Xpath":
                locator = By.xpath(locatorValue);
                break;
        }
        return locator;
    }


}