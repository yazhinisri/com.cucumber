$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Adactin Application smoketest automation sripts",
  "description": "",
  "id": "adactin-application-smoketest-automation-sripts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Adactin"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "To verify valid login details",
  "description": "",
  "id": "adactin-application-smoketest-automation-sripts;to-verify-valid-login-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user should be in adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \u0027yazhinisrii\u0027 in the email field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the \u0027yazhini\u0027 in the password field in loginpage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on login button in the login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_adactin_application()"
});
formatter.result({
  "duration": 5770664463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yazhinisrii",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_in_the_email_field(String)"
});
formatter.result({
  "duration": 435951536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yazhini",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_the_password_field_in_loginpage(String)"
});
formatter.result({
  "duration": 261429721,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button_in_the_login_page()"
});
formatter.result({
  "duration": 6361915874,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#And user should wait untill the page get loded"
    }
  ],
  "line": 10,
  "name": "To verify whether the check-out date field accepts a later date than checkin date",
  "description": "",
  "id": "adactin-application-smoketest-automation-sripts;to-verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user should be in adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enter \u0027yazhinisrii\u0027 in the email field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enter the \u0027yazhini\u0027 in the password field in loginpage",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user click on login button in the login page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#And user should wait untill the page get loded"
    }
  ],
  "line": 16,
  "name": "user select location in search hotel page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user select hotel in search hotel page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user select room type in search hotel page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user select number of rooms",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enter checkin date later than check out date",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user enter checkout date",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user click the search button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Verify that system gives an error saying check-in-date should not be later than check-out-date.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_adactin_application()"
});
formatter.result({
  "duration": 4084126033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yazhinisrii",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_in_the_email_field(String)"
});
formatter.result({
  "duration": 289570403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yazhini",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_the_password_field_in_loginpage(String)"
});
formatter.result({
  "duration": 260283481,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button_in_the_login_page()"
});
formatter.result({
  "duration": 1894133756,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_location_in_search_hotel_page()"
});
formatter.result({
  "duration": 248734112,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_hotel_in_search_hotel_page()"
});
formatter.result({
  "duration": 183413009,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_room_type_in_search_hotel_page()"
});
formatter.result({
  "duration": 183608549,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_number_of_rooms()"
});
formatter.result({
  "duration": 133802201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_checkin_date_later_than_check_out_date()"
});
formatter.result({
  "duration": 295002890,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_checkout_date()"
});
formatter.result({
  "duration": 291036964,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_search_button()"
});
formatter.result({
  "duration": 81658537,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()"
});
formatter.result({
  "duration": 95329692,
  "status": "passed"
});
});