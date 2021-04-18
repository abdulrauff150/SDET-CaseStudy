package StepDefinition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class Register {
    
WebDriver driver;

    
    @Given("I am able to navigate onto login page")
    public void I_am_able_to_navigate_onto_login_page()  {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ABDULRAUFFMOHAMMED\\Downloads\\chromedriver_V89\\chromedriver.exe");
     //This is to open new instance of browser
     driver = new ChromeDriver();
     //This is basically to open the application
     driver.get("http://elearningm1.upskills.in/");
     //if i want to maximize the screen
     driver.manage().window().maximize();
     //if i want to wait for sometime
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    }
    
    @When("^I click on Sign up link $")
    public void i_click_on_sign_up_link() throws Throwable {
        
    }

    @Then("^I am navigated to confirmation page$")
    public void i_am_navigated_to_confirmation_page() throws Throwable {
        
    }

    @And("^I enter First name as \"([^\"]*)\" $")
    public void i_enter_first_name_as_something(String strArg1) throws Throwable {
        
    }

    @And("^I enter Last name as \"([^\"]*)\" $")
    public void i_enter_last_name_as_something(String strArg1) throws Throwable {
       
    }

    @And("^I enter email address as \"([^\"]*)\" $")
    public void i_enter_email_address_as_something(String strArg1) throws Throwable {
        
    }

    @And("^I enter Username as \"([^\"]*)\"   $")
    public void i_enter_username_as_something(String strArg1) throws Throwable {
        
    }

    @And("^I enter Password as \"([^\"]*)\" $")
    public void i_enter_password_as_something(String strArg1) throws Throwable {
       
    }

    @And("^I enter confirm password as \"([^\"]*)\" $")
    public void i_enter_confirm_password_as_something(String strArg1) throws Throwable {
        
    }

    @And("^I click on Register button$")
    public void i_click_on_register_button() throws Throwable {
       
    }

    
    
}