Feature: MainSpring - Epics Module

Scenario: Verify Epics with valid data
	Given user is on MainSpring
	Then user Navigate to Epics
	And user Add Epics with valid data
	Then user close the driver
	
Scenario: Verify Epics with invalid data
	Given user is on MainSpring
	Then user Navigate to Epics
	Then user fill Epics with invalid data
	Then capture Error Message
	Then user close the driver