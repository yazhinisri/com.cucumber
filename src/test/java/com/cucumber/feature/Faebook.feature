
Feature: Faebook application smoketest automation sripts

@logocheck
Scenario: verify the login funtionality of the application with invalid credentials
    Given user should be in facebook application
   # Then user should see the facebook logo
    When user should enter the 'test@gmail' in the email field in login page
    And user enter the 'password' in the password field in loginpage
    And user click on login button in the login page
    And user should wait untill the page get loded
    Then user should see the facebook title in the forgot facebook page
 
@EmailValidation     
Scenario: Verify the login functionality
 # Given user should be in facebook application
  #Then user should see the facebook logo
  #When user should enter the email address in the email field in login page
  #And user enter the password in the password field in loginpage
  #And user click on login button in the login page 
  Then user should see the validation message    
    