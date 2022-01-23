Feature: feature to test login functionality

Scenario: Check login is successful with the valid credentails

Given user is on OrgangeHRM login page
When user enters username and password
And click on login button
Then it should redirect to homepage
