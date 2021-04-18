Feature: Login features
This feature includes sceanrio that would validate the following feature.
1) Login as Admin
2) Login as linda.anderson
3) Login with Nagative data

Background: 
@Login
Scenario: Login as Admin
Given I am able to navigate onto login page
When I click on Sign up link 
And I enter the password as "admin123" 
And I click on Login button
And I should see the username as "Welcome Paul" 

@Second
Scenario: Login as linda.anderson
Given I am able to navigate onto login page
When I enter the username as "Admin" 
And I enter the password as "admin123" 
And I click on Login button
And I should see the username as "Welcome Paul" 

@Negative
Scenario: Login with Negative Data
Given I am able to navigate onto login page
When I enter the username as "Abdul"
And I enter the password as "Abdul"
And I click on Login button
Then I should see error message as "Invalid Credentiasl" 