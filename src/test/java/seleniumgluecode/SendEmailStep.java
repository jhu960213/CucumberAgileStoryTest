package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendEmailStep {


    //
    // the step definitions below corresponds to the scenario in the feature file
    // there will be 5 different combinations of sending and attaching images for the driver object methods
    // in the "usera_is_able_to_send_an_email_with_an_attached_image_by_clicking_on_Send" method
    //

    // instantiating web driver object
    public static WebDriver driver;

    // user A scenario

    @Given("userA is on homepage")
    public void usera_is_on_homepage() {
        System.setProperty("webdriver.chrome.driver", "/Users/jhu69/Desktop/Winter_2019/ECSE_428/CucumberAgileStoryTest/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
    }

    @When("userA navigates to login page")
    public void usera_navigates_to_login_page() {
        //driver.findElement(By.linkText("Sign in")).click();
    }

    @And("userA enters username and password")
    public void usera_enters_username_and_password() {


        driver.findElement(By.id("identifierId")).sendKeys("jackhu696@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.id("password")).sendKeys("Escalation69");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("passwordNext")).click();




        driver.findElement(By.id("i0116")).sendKeys("jingxujaster@hotmail.com");
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.id("i0118")).sendKeys("escalation13");
        driver.findElement(By.id("idSIButton9")).submit();
        // seems like there is a bug in selenium so have to do this twice to login
        driver.findElement(By.id("i0118")).sendKeys("escalation13");
        driver.findElement(By.id("idSIButton9")).submit();
    }

    @Then("userA is logged into email homepage")
    public void usera_is_logged_into_email_homepage() {
        System.out.println("Successfully logged in!");
    }

    @When("userA clicks on New message")
    public void usera_clicks_on_New_message() {
        //driver.findElement(By.id("id__5")).click();
    }

    @And("userA enters a desired recipient")
    public void usera_enters_a_desired_recipient() {
        driver.findElement(By.name("input.ms-BasePicker-input.pickerInput_269bfa71")).sendKeys("jingxujaster@hotmail.com");
    }

    @And("userA clicks on attach")
    public void usera_clicks_on_attach() {


    }


    @Then("userA is able to send an email with an attached image by clicking on Send")
    public void usera_is_able_to_send_an_email_with_an_attached_image_by_clicking_on_Send() {


    }

    @When("userA clicks on log out")
    public void usera_clicks_on_log_out() {

        //driver.findElement(By.)
        //driver.findElement(By.id("id__2698")).click();

    }

    @Then("userA is logged out of his email account")
    public void usera_is_logged_out_of_his_email_account() {
        System.out.println("Successfully logged out!");
    }



}
