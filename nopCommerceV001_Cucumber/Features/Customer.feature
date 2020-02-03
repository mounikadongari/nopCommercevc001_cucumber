Feature: Customer



Background: Below are the common steps for each scenario
Given user Launch Chrome browser
When user opens Url "http://admin-demo.nopcommerce.com/login"
And user enters Email as "admin@yourstore.com" and Password as "admin"
And click on Login
Then User can view Dashboard




@sanity
Scenario: Add a new Customer

When User click on customers Menu
And click on customers Menu Item
And click Add new button
Then User can view Add new Customer page
When User enter Customer info
And click on Save button
Then User can view confirmation message "The new customer has been added successfully."
And close browser.

@regression
Scenario: search Customer by EMailID

When User click on customers Menu
And click on customers Menu Item
And Enter customer EMail
When Click on search button
Then User should found Email in the Search table
And close browser.


@regression
Scenario: Search Customer by Name

When User click on customers Menu
And click on customers Menu Item
And Enter customer FirstName
And Enter customer LastName
When Click on search button
Then User should found Name in the Search table
And close browser.