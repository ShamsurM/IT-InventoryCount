# Project name: ComputerDatabase

Author: Shamsur R Masum

CopyRight:

 
# Tools used:
1.	Selenium WebDriver with java
2.	TestNG framework
3.	Maven build tool
4.	Eclipse IDE

# “src/test/java” folder contains three packages-
1.	'com.qa.pageobject'- 
Since there are not too many page objects in the given assignment, so have put all the required page object in one file and named as- ‘computerDatabasePage.java’.  But based on the nature of the project separate page object file can be created for each spate page.
2.	'com.qa.test'-
This package contain actual (create, read, update, delete) test scripts in the file named as-‘CRUD_Test.java’. 
Beside that this package also contain the file- ‘testBase.java’ which contain test script related re-configuration like- opening the appropriate browser and loading the test URL, and closing the browser once the test execution is over. 
3.	'com.qa.utility'-
To enhance the maintainability of the test suite, test data is locating in an external file named- ‘dataFile.properties’. Data is locating in the file as name-value pear and value can be changed before execution (even though it is not necessary to change data every time).
There are another file in this package named- ‘dataFileReader.java’, it contain all the necessary configuration to read data from the external data file and feed the data to the test scripts.

# pom.xml-
This file contains all the necessary Maven dependencies and configuration.

# testng.xml-
Since TestNG framework been used in the project, so this file contains the configuration to run the test scripts as TestNG test suite. 

# Test execution-
Test scripts can be executed in multiple ways-
Right click on the ‘testng.xml’ file in the project tree, go to ‘Run As’ the select ‘TestNG Suite’, test execution will start. 

Executing by going command line-
Go to the project directory and execute the comments-
   mvn clean install
   mnv test

# Test report:
I did not add any advance reporting features for the project but TestNG frame work has its own reporting feature and the report can be viewed by opening any of the html file in the web browser-
  1.	test-output>ComputerDatabase_CRUD>Regression.html
  2.	test-output>index.html
If ‘test-output’ folder is not visible yet then just execute the test script once then it will be visible.  




 
