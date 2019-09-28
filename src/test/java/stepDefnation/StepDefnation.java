package stepDefnation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefnation {
    WebDriver driver;

    @Given("^I am Accessing facebook page$")
    public void i_am_Accessing_facebook_page() {
        System.out.println("i am accessing facebook page");
        System.setProperty("webdriver.chrome.driver", "C://Users//Chetakrao//IdeaProjects//AutomationPractice2//src//test//java//chromedriver.exe");
        driver=new ChromeDriver();   ///launch the chrome browser
        driver.get("https://www.facebook.com");
    }

    @When("^I can see the username and password$")
    public void i_can_see_the_username_and_password()  {
        System.out.println("i can see username and password");

    }

    @Then("^I am in login page$")
    public void i_am_in_login_page()  {
        System.out.println("i am in login page");
        Assert.assertEquals(true,driver.getTitle().contains("Facebook"));

       // driver.quit();

    }
}
