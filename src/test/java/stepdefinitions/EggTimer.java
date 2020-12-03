package stepdefinitions;

import basesetup.TestBaseInitilization;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import objectrepository.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static java.lang.Thread.sleep;

public class EggTimer extends TestBaseInitilization {

   WebDriver eggtimer;
   public EggTimer() {
       this.eggtimer = intilizeDriver();
   }
    PageObject objectrepo = new PageObject();
    @Given("Open and Navigate to the EggTimer url")
    public void launch_url() throws InterruptedException {
        eggtimer.get(objectrepo.eggTimer_url);
        Thread.sleep(100);
    }
    @When("Open homepage and verify the Title")
    public void open_homepage_and_verify_the_title() throws InterruptedException {
        eggtimer.get(objectrepo.eggTimer_url);
        Thread.sleep(100);
        String expectedTitle_Homepage = "e.ggtimer - a simple countdown timer";
        String actualTitle_Homepage = eggtimer.getTitle();

        if(actualTitle_Homepage.equalsIgnoreCase(expectedTitle_Homepage))
            System.out.println("Title Matches, Passed" + actualTitle_Homepage);
        else
            System.out.println("--No Title Match -- Failed ");
    }

    @Then("Verify the logo present on page")
    public void verify_the_logo_present_on_page() throws InterruptedException {
//        driver.findElement(enter_text_field).sendKeys(enterText_in_Secs);
//        driver.findElement(Start_button).click();
//        Thread.sleep(60);
//        driver.findElement(objectrepo.).click();
        this.objectrepo.needHelp.click();

//        driver.findElement((By) objectrepo.needHelp).click();
//        driver.findElement(objectrepo.start_button).click();

//        driver.findElement(clickOn_10Mins).click();
//        driver.findElement(refresh_button).click();
//
//        String actualTitle_inSecs = driver.getTitle();
//        System.out.println(actualTitle_inSecs);
        sleep(1000);
    }

    @Then("Verify the homepage title")
    public void verify_the_homepage_title() {

    }

    @Then("Close the Chrome browser")
    public void close_the_chrome_browser() throws InterruptedException {
        eggtimer.quit();
        Thread.sleep(500);
    }
}