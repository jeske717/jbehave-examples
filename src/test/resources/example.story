Scenario: Validator validates single items
Given I have a validator
When I validate 'foo'
Then the validation result should be 'OK'

Scenario: Validator validates single items with errors
Given I have a validator
When I validate '$$$$'
Then the validation result should be 'illegal character'

Scenario: Validator validates according to the rules
Given I have a validator
When I validate <value>
Then the validation result should be <expected>

Examples:
|value|expected|
|%|illegal character|
|x|OK|