Feature: Application Login

#To use common scenario accross all scenarios and it will be executed before every scenario we use Background
Background:
When launch browser using config file
Then hit the home page url


#Resuable

@MobileTest @Netbanking @Regression
Scenario: User Page Default login
Given user is on NetBanking landing page
When user login into appication with user and password 0987
Then home page is displayed
And Cards are displayed

# Above scenario for multiple users with same access

@Smoke @Regression @Mortgage
Scenario Outline: User Page Default login
Given user is on NetBanking landing page
When user login into appication with <username> and password <password>
Then home page is displayed
And Cards are displayed

Examples:
 |username|password|
 |normal user|normal123|
 |credit user|credituser|
 |debit user|debituser|

#If lot of input is required

@Smoke
Scenario: Admin Page Default Sign up
Given user is on practice landing page
When user signup into application
|shubham|
|sighal|
|shubham@gmail.com|
|8979306003|
Then home page is displayed
And Cards are displayed

