Feature: Google Search
	'When I go to the Google org.cucumber.base.search page, and org.cucumber.base.search for an item,
		I expect to see some reference to that item in the first result.'

Scenario: Google Search First Result
	Given that I have gone to the Google page
	When I add "Download Selenium" to the org.cucumber.base.search box
	And click the Search Button
	Then "Downloads - Selenium" should be mentioned in the first result