$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: G:\\mounika se\\selenium workspace\\selenium libraries\\cucumberworkspace\\nopCommerceV001_Cucumber\\mounika seselenium workspaceselenium librariescucumberworkspace\nopCommerceV001_Cucumbersrc\testjavabrowser_driverschromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:589)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:154)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:149)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:36)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:195)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:389)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:118)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:105)\r\n\tat stepDefinations.steps.setup(steps.java:44)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user opens Url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.steps.user_opens_Url(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add a new Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.click_Add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Add new Customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.steps.user_can_view_Add_new_Customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter Customer info",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.steps.user_enter_Customer_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.steps.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
