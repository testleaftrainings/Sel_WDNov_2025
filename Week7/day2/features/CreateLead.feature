Feature: Verify the user can able to create Lead using the CRM application 

Background:
    When user enters the username as "demosalesmanager"
	And user enters the password as "crmsfa" 
	And user clicks the submit button 
	And user clicks the crmsfa link 
	And user clicks the leads link 
	And user clicks the create lead link 
	
@positive
Scenario: Test to verify the create lead functionality with the valid test data
	 
	
	When user enters the company name as "TCS" 
	And user enters the first name as "Harrish"
	And user enters the last name as "A"
	And user enters the phone number as "89257"
	And user clicks the create lead submit button 
	Then user verify the lead id using the company name 
	
@negative	
Scenario: Test to verify the lead creation functionality without providing the mandatory fields
     
	
	When user enters the phone number as "00000"
	And user clicks the create lead submit button 
	But user verify the error message 
	