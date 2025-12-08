Feature: Verify the user can able to create Lead using the CRM application 

Background:
    When user enters the username as 'demosalesmanager'
	And user enters the password as 'crmsfa' 
	And user clicks the submit button 
	And user clicks the crmsfa link 
	And user clicks the leads link 
	And user clicks the create lead link 
@positive
Scenario Outline: Test to verify the create lead functionality with the valid test data
	 
	
	When user enters the company name as <cname> 
	And user enters the first name as <fname> 
	And user enters the last name as <lname> 
	And user enters the phone number as <phno>
	And user clicks the create lead submit button 
	Then user verify the lead id using the company name 
	
Examples:
    
	|cname|fname|lname|phno|
	|CTS|Harrish|A|89257|
	|Wipro|Vineeth|R|87127|
@negative	
Scenario: Test to verify the lead creation functionality without providing the mandatory fields
     
	
	When user enters the phone number as '00000'
	And user clicks the create lead submit button 
	But user verify the error message 

#Scenario Outline: scenario description
#	Given a precondition has value <param_1>
#		And something with <param_2>
#		Then check <param_3> is the output
#		
#		Examples:
#		| param_1 | param_2 | param_3 |
#		| value1_1 | value1_2 | value1_3 |
#		| value2_1 | value2_2 | value2_3 |
#		| value3_1 | value3_2 | value3_3 |
#		 
#		
	