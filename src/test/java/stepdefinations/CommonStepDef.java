package stepdefinations;

import baseFile.BaseFile;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




public class CommonStepDef extends BaseFile {


    private static Logger log = Logger.getLogger(CommonStepDef.class);

    /**
     * Delete all cookies at the start of each scenario to avoid shared state
     * between tests ({ "@Regression" }) - we can run only before and after for
     * particular tags using this
     *
     * @throws Exception
     */

    @Before
    public void deleteAllCookies() throws Exception {

       // seleniumUtils.delete_Cookies();
    }

    /**
     * @throws Exception
     */

    @After
    public void embedScreenshot(Scenario scenario) throws Exception {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) web_driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

    }

    @Given("^user types \"([^\"]*)\" in browser URL space$")
    public void typeURL_(String url) throws Throwable {

        navigateToEnv(url);
    }


    @Then("^I refresh the Page$")
    public void refreshPage() {

        seleniumUtils.refreshPage();
        seleniumWait.pause(1.5);
    }



    public boolean navigateToEnv(String url) throws Exception {

        switch (url) {

            case "ebay_Url":

                seleniumUtils.navigateTo(config_.getProperty(url));
                log.info("Navigating to ebay  environment");

                return true;
        }
        return false;
    }


}