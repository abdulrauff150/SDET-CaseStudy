Feature: Login features
This feature includes sceanrio that would validate the following feature.
1) Login as Admin
2) Login as linda.anderson
3) Login with Nagative data

Background: 
@Register
Scenario: Register to elearning site
Given I am able to navigate onto login page
When I click on Sign up link 
And I enter First name as "AbdulRauff" 
And I enter Last name as "Mohammed" 
And I enter email address as "abdulbasmail@gmail.com" 
And I enter Username as "abdulmohamq123"   
And I enter Password as "abdul@123" 
And I enter confirm password as "abdul@123" 
And I click on Register button
Then I am navigated to confirmation page

@Register
Scenario: Send test mail
Given I am in confiramtion page
When I click on drop down on top right
And I verify my name and email id
And I click on Inbox icon
And I click on Compose icon
And I fill in Send to as "test1" 
And I enter subject as "test msg" 
And I enter message as "testing mail send" 
And I click on button send message
Then I can see confirmation of message sent 


 