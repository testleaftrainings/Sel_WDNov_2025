Feature: Verify the user can able to create Lead using the CRM application 

Scenario: Test to verify the create lead functionality with the valid test data
 
	Given launch the browser and load the URL 
	When user enters the username as demosalesmanager 
	When user enters the password as crmsfa 
	When user clicks the submit button 
	When user clicks the crmsfa link 
	When user clicks the leads link 
	When user clicks the create lead link 
	When user enters the company name as Testleaf 
	When user enters the first name as Bhuvanesh 
	When user enters the last name as M 
	When user enters the phone number 
	When user clicks the submit button 
	Then user verify the lead id using the company name 
