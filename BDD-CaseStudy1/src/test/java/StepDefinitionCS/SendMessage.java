package StepDefinitionCS;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendMessage {
	
	WebDriver driver;
	
	@Given("I am in confiramtion page")
    public void i_am_in_confiramtion_page() throws Throwable {
        
    }

    @When("I click on drop down on top right")
    public void i_click_on_drop_down_on_top_right() throws Throwable {
    	
    	 /*Actions actions = new Actions(driver);
    	 WebElement menuOption = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a"));
    	 actions.moveToElement(menuOption).perform();
    	 menuOption.click(); */
    	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/unknown.png']")).click();
    	

    }

    @Then("I can see confirmation of message sent")
    public void i_can_see_confirmation_of_message_sent() throws Throwable {
    	String name = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	    String Actualdata = "The message has been sent to kogile nethra (nethra123)";
	    Assert.assertEquals(name,Actualdata);
	    System.out.println("The message has been sent to kogile nethra (nethra123)");	
	    driver.close();
    }

    @And("I verify my name and email id")
    public void i_verify_my_name_and_email_id() throws Throwable {
       
    }

    @And("I click on Inbox icon")
    public void i_click_on_inbox_icon() throws Throwable {
    	 driver.findElement(By.xpath("//a[@title='Inbox']")).click();
    }

    @And("I click on Compose icon")
    public void i_click_on_compose_icon() throws Throwable {
    	driver.findElement(By.xpath("//img[@alt='Compose message']")).click();
    }

    @And("I fill in Send to as {string}")
    public void i_fill_in_send_to_as_something(String strArg1) throws Throwable {
    	WebElement textbox= driver.findElement(By.cssSelector("input.select2-search__field"));
		textbox.sendKeys(strArg1);
		Thread.sleep(5000);
		//textbox.submit();
		textbox.sendKeys(Keys.ENTER);
    }

    @And("I enter subject as {string}")
    public void i_enter_subject_as_something(String strArg1) throws Throwable {
    	WebElement textbox= driver.findElement(By.id("compose_message_title"));
		textbox.sendKeys(strArg1);
    }

    @And("I enter message as {string}")
    public void i_enter_message_as_something(String strArg1) throws Throwable {
       
    }

    @And("I click on button send message")
    public void i_click_on_button_send_message() throws Throwable {
    	driver.findElement(By.id("compose_message_compose")).click();
    }


}
