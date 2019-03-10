package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class SendEmailStep {


    //
    // the step definitions below corresponds to the scenario in the feature file
    // there will be 5 different combinations of sending and attaching images for the driver object methods
    // in the "usera_is_able_to_send_an_email_with_an_attached_image_by_clicking_on_Send" method
    //

    // instantiating web driver object
    public static WebDriver driver;

    // user A scenario

    @Before
    public void setWebDriver(){
        // instantiating web driver object
        System.setProperty("webdriver.chrome.driver", "/Users/antoine/git/ECSE428CucumberAutomatedTests/CucumberAgileStoryTest/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://mail.google.com/");
    }

    @Before
    public void initialState(){
        //set the email
        System.out.println("Attempting to enter email to login.");
        WebElement email = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/content[1]/section[1]/div[1]/content[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
        email.sendKeys("jochampion17@gmail.com");

        //click on next
        WebElement next = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/content[1]/span[1]")));
        next.click();
        System.out.println("Email entered");

        //set the password
        System.out.println("Attempting to enter password to login.");
        WebElement password = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/content[1]/section[1]/div[1]/content[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
        password.sendKeys("ecse428!");

        //click on next
        WebElement btn = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/content[1]/span[1]")));
        btn.click();
        System.out.println("Password entered");
    }

    @After
    public void resetInitialState(){
        // clicking on google account button first to collapse what’s inside
        System.out.println("Attempting to return to inbox page.");
        WebElement inbox = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[4]/header[1]/div[2]/div[1]/div[4]/div[1]/a[1]/img[1]")));
        inbox.click();
        System.out.println("Back to inbox page.");
        driver.quit();
    }

    @Given("^I am logged into an email account$")
    public void i_am_logged_into_an_email_account(){
        System.out.println("I am logged in");
    }

    @When("^I click on New message$")
    public void i_click_on_New_message(){
        //click on new message
        System.out.println("Attempting to find the new message button.. ");
        WebElement btn = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
        System.out.print("Found!\n");
        btn.click();

    }

    @And("^I enter \"([^\"]*)\" as recipient address$")
    public void i_enter_a_desired_recipient_address(String string) throws InterruptedException {
        //set email recipient
        System.out.println("Attempting to enter email recipient.");
        WebElement btn = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.name("to")));
        btn.sendKeys(string + Keys.ENTER);
        System.out.println("Email recipient set");
    }

    @And("^I enter \"([^\"]*)\" as recipient CC$")
    public void i_enter_a_desired_recipientCC_address(String string) throws InterruptedException {
        //set email recipient
        System.out.println("Attempting to enter email recipient.");
        WebElement btn = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.name("to")));
        btn.sendKeys(string + Keys.ENTER);
        System.out.println("Email recipient set");
    }

    @And("^I enter \"([^\"]*)\" as the file in body text$")
    public void i_enter_a_desired_in_body_text(String string) throws InterruptedException {
        //set email body text
        System.out.println("Attempting to set body text.");
        WebElement text = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]")));
        text.click();
        text.sendKeys("Hi! I have inserted an image attachment!");
        System.out.println("Body text set");

        // find the input element
        WebElement elem = driver.findElement(By.xpath("//input[@type='file']"));
        // 'type' the file location to it as it were a usual <input type='text' /> element
        elem.sendKeys("/Users/antoine/Documents/Pictures/"+string);
        (new WebDriverWait(driver, 25)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.dO")));
    }


    @And("^I click on send$")
    public void i_click_on_send() throws InterruptedException {
        //click on send email
        System.out.println("Attempting to send the email.");
        WebElement send = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")));
        send.click();
        System.out.println("Email sent");
       (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("aT")));

    }

    @Then("^I have sent an email with an attachment to the proper recipient$")
    public void i_have_sent_an_email_with_an_attachment_to_the_proper_recipient() throws InterruptedException {
        WebElement emailStatus = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("aT")));
        try {
            while(emailStatus.getText().contains("Sending"));
        } catch (Exception e){
            emailStatus = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("aT")));
        }
        Assert.assertTrue(confirmEmailSent(emailStatus));
        System.out.println("Confirmation that email has been sent.");
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.dO")));
    }

    private boolean confirmEmailSent(WebElement messageSentPopup){
        return messageSentPopup.getText().contains("Message sent");
    }
}
