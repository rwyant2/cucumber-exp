Feature: Validate Drop Down
See that the dropdown results come back properly

## For purposes of a cucumber demo, "third" is pointless, but 
## gives me an idea for SeleniumJava I want to document.  
Scenario: all the choices
Given I launch Chrome browser
And i go to the html5 demo page
Then i choose delicious hot dog condiments
|topping|result|third|
|mustard|yellow|uno|
|tomato |red   |dos|
|onions |white |tre|

Scenario: bad choices :(
Given I launch Chrome browser
And i go to the html5 demo page
Then i choose delicious hot dog condiments
|topping|result|third|
## testing that it fails appropriately when a dropdown option doesn't exist
|toothpaste|should fail|quatro|