Feature: Funtionality of the Login Page


Background:
Given Launch the browser and load the url


Scenario: Tc001_Positive functionality of the login page
When Enter the username as 'demosalesManager'
And Enter the password as 'crmsfa'
When Click the Login button
Then Landing in the home page
 



Scenario Outline: Create Lead funtionality
When Enter the username as <uname>
And Enter the password as <pwd>
When Click the Login button
When Click the crmsfa link
When Click the Leads link
When click the createlead link
Then Enter the companyname as <companyname>
Then Enter the firstname as <fname>
Then Enter the lastname as <lname>
When click the createlead button
Then Leads created Successfully

Examples:
|uname|pwd|companyname|fname|lname|
|'demoSalesManger'|'crmsfa'|'TL'|'Vidya'|'R'|
|'demoSalesManager'|'crmsfa'|'Testleaf'|'Princila'|'Edward'|

