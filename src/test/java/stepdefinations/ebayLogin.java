package stepdefinations;

import baseFile.BaseFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;



public class ebayLogin extends BaseFile {



    @When("^I click on  signin$")
    public void i_click_on_signin() throws Throwable {
        seleniumWait.pause(3.0);
        web_driver.findElement(By.linkText("Sign in")).click();
        seleniumWait.pause(3.0);

    }

    @Then("^type username and password to login$")
    public void type_username_and_password_to_login() throws Throwable {
        seleniumWait.pause(3.0);
        web_driver.findElement(By.xpath("//div[4]/span[2]/input")).sendKeys("Myfirsttest@gmail.com");
        //web_driver.findElement(By.xpath("//div[@placeholder='Email or username']")).sendKeys("Myfirsttest@gmail.com");

        System.out.print("good till here");

        web_driver.findElement(By.xpath("//div[5]/div/div[5]/span[2]/input")).sendKeys("Cooperteam");
        //web_driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Cooperteam");

        System.out.print("entered password");

        seleniumWait.pause(3.0);

        web_driver.findElement(By.id("sgnBt")).click();
    }

    @And("^verify \"([^\"]*)\" is displayed$")
    public void verifyIsDisplayed(String username) throws Throwable {
        seleniumUtils.isElementDisplayed("username");

        System.out.print("user logged in and name displayed");

        seleniumWait.pause(3.0);

        seleniumUtils.click("username");

        seleniumWait.pause(2.0);
    }


    @Then("^click on logout$")
    public void clickOnLogout() throws Throwable {

        seleniumUtils.click("log_out");
        seleniumUtils.close();


    }



}


