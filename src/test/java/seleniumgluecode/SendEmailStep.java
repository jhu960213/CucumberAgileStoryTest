package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.util.List;
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
    public void usera_is_on_homepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/antoine/git/ECSE428CucumberAutomatedTests/CucumberAgileStoryTest/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://mail.google.com/");
    }

    @When("userA navigates to login page")
    public void usera_navigates_to_login_page() {
       // driver.findElement(By.linkText("Sign in")).click();
    }

    @And("userA enters username and password")
    public void usera_enters_username_and_password() throws InterruptedException {
        //set the email
        driver.findElement(By.id("identifierId")).sendKeys("jochampion17@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();  // Click on next
        Thread.sleep(1000);  //wait needed here To get the password page.


        //set the password
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ecse428!");  // click on next
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content")).click();  //If your page redirect to google security page.
        Thread.sleep(2000);
    }

    @Then("userA is logged into email homepage")
    public void usera_is_logged_into_email_homepage() {
        System.out.println("Successfully logged in!");
    }

    @When("userA clicks on New message")
    public void usera_clicks_on_New_message() {
        //click on new message
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();

    }

    @And("userA enters a desired recipient")
    public void usera_enters_a_desired_recipient() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);   // implement wait here to load all data.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
        //set recipient email
        driver.findElement(By.name("to")).sendKeys("jochampion17@gmail.com");

        //set message body
        driver.findElement(By.id(":9c")).click();
        driver.findElement(By.id(":9c")).sendKeys("Hey! I have included an image attachment. ");

        //add an attachment
        driver.findElement(By.id(":9p")).click();

        //click on send email
        driver.findElement(By.id(":7x")).click();
//        Thread.sleep(8000);  // Apply wait for sending mail
//        driver.close();


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
