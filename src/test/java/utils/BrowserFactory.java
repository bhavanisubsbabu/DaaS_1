/**
 *
 */
package utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;


public class BrowserFactory {


    WebDriver remoteDriver;
    DesiredCapabilities cap;

    final static String IE10= "ie10";
    final static String IE11 = "ie11";
    final static String EDGE = "edge";
    final static String SAFARI = "safari";
    final static String FIREFOX = "firefox";
    final static String GHOST = "phantomjs";
    final static String CHROME_VM = "chromeVM";
    final static String CHROME_BB = "chromebb";
    final static String HEADLESS = "htmlunitdriver";
	Properties config_ = SeleniumBaseFile.getInstance().configurations_File;
	static Log log = LogFactory.getLog(BrowserFactory.class);



    public WebDriver getRemoteDriver() {

        switch (getBrowser()) {

            case HEADLESS:

                remoteDriver = new HtmlUnitDriver();

                break;

            case SAFARI:

                remoteDriver = new SafariDriver();

                break;

            case IE11:

                remoteWebDriverUrl(ieCapabilities(), "WIN7_IE11");

            case IE10:

                remoteWebDriverUrl(ieCapabilities(), "WIN7_IE10");

                break;

            case CHROME_BB:

                remoteWebDriverUrl(chromeCapabilities(), "BB_Chrome");

                break;


            case CHROME_VM:

                remoteWebDriverUrl(chromeCapabilities(), "ChromeVWC250");

                break;

            case GHOST:

                remoteWebDriverUrl(phantomJsCapablities(), "Ghostdriver");

                break;
        }

        maximizeBrowser_();
        log.info("Opening Driver ");
        return remoteDriver;
    }


    private DesiredCapabilities chromeCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--test-type");
        options.addArguments("--disable-extensions");  //This disables all extensions in Chrome Driver (implemented because of annoying Chrome popup about developer mode extensions that gets in the way of tests).
        options.addArguments("disable-infobars");
        cap = DesiredCapabilities.chrome();
       cap.setCapability(ChromeOptions.CAPABILITY, options);
        log.info(cap.getBrowserName());
        cap.setPlatform(org.openqa.selenium.Platform.ANY);
        cap.setCapability(
                CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        cap.setCapability("record-video", true);

        return cap;

    }

    private DesiredCapabilities firefoxCapablities() {
        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile firefoxProfile = profile.getProfile("seleniumProfile");
        cap = DesiredCapabilities.firefox();
        cap.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
        cap.setCapability("TakesScreenshot", true);
        log.info(cap.getBrowserName());
        cap.setPlatform(org.openqa.selenium.Platform.ANY);
        cap.setCapability("record-video", true);
        return cap;
    }

    private DesiredCapabilities ieCapabilities() {
        cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(
                InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                true);
        cap.setCapability("ensureCleanSession", true);
        cap.setCapability("TakesScreenshot", true);
        log.info(cap.getBrowserName());
        cap.setPlatform(org.openqa.selenium.Platform.ANY);
        cap.setCapability("record-video", true);
        return cap;
    }

    private DesiredCapabilities phantomJsCapablities() {
        cap = DesiredCapabilities.phantomjs();
        cap.setJavascriptEnabled(true);
        cap.setCapability("TakesScreenshot", true);
        cap.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "//Users//rnaidu//phantomjs-2.1.1-macosx//bin//phantomjs");
       // cap.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, new String[] { "--ignore-ssl-errors=true", "--ssl-protocol=tlsv1", "--web-security=false" });
        cap.setPlatform(Platform.ANY);
        cap.setCapability("handlesAlerts", true);
        cap.setCapability("record-video", true);
        log.info(cap.getBrowserName());
        return cap;
    }

    private void remoteWebDriverUrl(DesiredCapabilities desiredCapabilities, String vmUrl) {
        try {
            remoteDriver = new RemoteWebDriver(
                    new URL(config_.getProperty(vmUrl)), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }


    private static String getBrowser() {
        return System.getProperty("browser");

    }

    private void maximizeBrowser_() {
        remoteDriver.manage().window().maximize();
    }


}