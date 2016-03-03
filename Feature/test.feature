Feature: login and logout functionality
Scenario: verify login functionality 
Given the browser is launched and navigate to the url
When we enter the user name and password
And click on login button
Then welcome admin msg is displayed