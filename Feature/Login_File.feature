Feature: Demo QA Login Functionality
Description: This feature will test a LogIn and Logout functionality

Scenario: Successful Login with Valid credentials
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully


Scenario: Successful logout from the Application
  When User LogOut from the Application
	Then Message displayed Logout Successfully


