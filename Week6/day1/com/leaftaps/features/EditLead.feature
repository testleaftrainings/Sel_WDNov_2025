Feature: Verify the user can able to Edit Lead using the CRM application

Background:
    When user enters the username as 'demoCsr2' 
	And user enters the password as 'crmsfa' 
	And user clicks the submit button 
	And user clicks the crmsfa link 
	And user clicks the leads link 
	
@edit
Scenario: Test to verify the Edit lead functionality with the valid test data
	When user clicks the find lead link
	And user clicks the phone tab
	And user enters the phone number of the lead id
	And user clicks the find lead button
	And user select the first lead for the list
	And user click the edit button
	And user edits the existing leads data
	And user clicks the update button
	