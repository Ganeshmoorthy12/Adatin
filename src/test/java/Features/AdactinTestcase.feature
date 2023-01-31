

@login
Feature:Adactin Smoke Testcase Automation

@TC101
Scenario: To verify the valid logindetails
Given user launch the "Chrome" browser
And  user navigate url "http://adactinhotelapp.com/index.php"
Then  user verify the login page
And  user Enter the user name "MoorthyKumar"
And  User Enter the password "Moorthykumar@08"
And  user click the login Button
Then  User verfy the login sucessfully

@TC102
Scenario: To verify the invalid logindetails
Given user launch the "Chrome" browser
And  user navigate url "http://adactinhotelapp.com/index.php"
Then  user verify the login page
And  user Enter the user name "MoorthyYKumar"
And  User Enter the password "Moorthykumar@@08"
And  user click the login Button
Then  User verfy the login sucessfully
Then User verify error message"Invalid Login details or Your Password might have expired"

@TC103
Scenario Outline:To verify the invalid logindetails
Given user launch the "Chrome" browser
And  user navigate url "http://adactinhotelapp.com/index.php"
Then  user verify the login page
And  user Enter the user name <Username>
And  User Enter the password <Password>
And  user click the login Button
Then  User verfy the login sucessfully
Then User verify error message"Invalid Login details or Your Password might have expired"

Examples:
|Username|Password|
|"MoorthyYKumar"|"Moorthykumar@08"|
|"MoorthyKumar"|"Moorthykumar@08"|
|"MoorthyYKumar"|"Moorthykumar@@08"|

 
