Feature: Login

@sanity
Scenario: Successful Login with Valid Credentials
Given user Launch Chrome browser
When user opens Url "http://admin-demo.nopcommerce.com/login"
And user enters Email as "admin@yourstore.com" and Password as "admin"
And click on Login
Then pagetitle should be "Dashboard / nopCommerce administration"
When User click on Log out link
Then page Title should be "Your store. Login"
And close browser.

@regression
Scenario Outline: Login  Data Driven
Given user Launch Chrome browser
When user opens Url "http://admin-demo.nopcommerce.com/login"
And user enters Email as "<email>" and Password as "<password>"
And click on Login
Then pagetitle should be "Dashboard / nopCommerce administration"
When User click on Log out link
Then page Title should be "Your store. Login"
And close browser.

Examples:
| email | password |
| admin@yourstore.com | admin |
| admin1@yourstore.com | admin123|
