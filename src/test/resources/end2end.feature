Feature: Automation end2end tests   to verify users scenarios on 'http://automationexercise.com'
  As a new user
  I want to create an account on the webpage
  I want login to my account
  So that I can access the website's features

  Scenario: Registration new user
    Given I am on HomePage'
    When  Verify that home page is visible successfully
    Then Click on 'Signup / Login' button
    Then Verify 'New User Signup!' is visible
    Then Enter name and email address and Click 'Signup' button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    Then Fill details: Title, Name, Email, Password, Date of birth
    Then Select checkbox 'Sign up for our newsletter!'
    Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click 'Create Account button'
    Then Verify that 'ACCOUNT CREATED!' is  visible
    Then Click 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

  Scenario: Login to account
    Given I am on HomePageLogin 'http://automationexercise.com'
    When I verify that home page is visible successfully
    Then I Click on 'Signup / Login' button
    Then I Verify 'Login to your account' is visible
    Then I Enter correct email address and password
    |email|password|
    When I Click 'login' button
    Then I Verify that 'Logged in as username' is visible
    Then Then i click  'Delete Account' button
    Then Finaly i verify  'ACCOUNT DELETED!' is visible









