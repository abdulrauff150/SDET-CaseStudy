package StepDefinition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class Login {
    
WebDriver driver;

    
    @Given("I am able to navigate onto login page")
    public void I_am_able_to_navigate_onto_login_page()  {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ABDULRAUFFMOHAMMED\\Downloads\\chromedriver_V89\\chromedriver.exe");
     //This is to open new instance of browser
     driver = new ChromeDriver();
     //This is basically to open the application
     driver.get("https://opensource-demo.orangehrmlive.com/");
     //if i want to maximize the screen
     driver.manage().window().maximize();
     //if i want to wait for sometime
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    }
    @When("I enter the username as {string}")
    public void i_enter_the_username_as(String string)  {
       driver.findElement(By.id("txtUsername")).sendKeys(string);
       
    }
    @When("I enter the password as {string}")
    public void i_enter_the_password_as(String string)  {
        driver.findElement(By.id("txtPassword")).sendKeys(string);
       
    }
    @When("I click on Login button")
    public void i_click_on_login_button()  {
        driver.findElement(By.id("btnLogin")).click();
    }    
    
    @Then("I should see the username as {string}")
        public void i_should_see_username_as(String string) throws InterruptedException {
        String name = driver.findElement(By.id("welcome")).getText() ;   
        String Actualdata = string ;
        Assert.assertEquals(name, Actualdata);
        System.out.println("login successfull");
        driver.close();
    }
    
    @Then("I should see error message as {string}")
        public void i_should_see_error_message_as(String string) {
           String actualerr = driver.findElement(By.id("spanMessage")).getText() ;
           String Expectederr = "Invalid credentials";
           Assert.assertEquals(Expectederr, actualerr);
           driver.close();
        }
    
    
}