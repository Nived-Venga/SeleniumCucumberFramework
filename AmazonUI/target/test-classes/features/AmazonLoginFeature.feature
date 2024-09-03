Feature: Amazon Login Page

Background: 
Given Test start

@SanityTest
Scenario: User login Page Validations
Given User navigates to amazonurl
Then Validate Title
Then Validate Amazon Logo

@SmokeTest
Scenario Outline: User Search with Multiple Data Sets
Given User login to amazonurl
When User searches text
|Car|
|Bag|
|Phone|
Then Search Items are displayed properly 


Scenario: Validate logged In User
Given User login to amazonurl
Then Validate Logged In User