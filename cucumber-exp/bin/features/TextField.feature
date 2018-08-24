Feature: Validate Text Field
See that the text field comes back with the right data

Scenario: text field works horray!!1!
Given I launch Chrome browser
And i go to the html5 demo page
When i fill in text "ey b0ss can i have job please?"
And i click submit
Then the text "ey b0ss can i have job please?" appears magicably through the power of springboot

## This is put in on purpose to see how test failures are handled.
Scenario: intentional text fail
And i go to the html5 demo page
When i fill in text "i am too lazy to capitalize words :-O"
And i click submit
Then the text "ey b0ss can i have job please?" appears magicably through the power of springboot
