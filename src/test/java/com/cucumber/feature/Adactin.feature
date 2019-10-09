@Adactin
Feature: Adactin Application smoketest automation sripts
Scenario: To verify valid login details
Given user should be in adactin application
When user enter 'yazhinisrii' in the email field
When user enter the 'yazhini' in the password field in loginpage 
And user click on login button in the login page 
#And user should wait untill the page get loded

Scenario: To verify whether the check-out date field accepts a later date than checkin date
Given user should be in adactin application 
When user enter 'yazhinisrii' in the email field
When user enter the 'yazhini' in the password field in loginpage 
And user click on login button in the login page
#And user should wait untill the page get loded
When user select location in search hotel page
When user select hotel in search hotel page
When user select room type in search hotel page
When user select number of rooms
When user enter checkin date later than check out date
When user enter checkout date
When user click the search button
Then Verify that system gives an error saying check-in-date should not be later than check-out-date.

 