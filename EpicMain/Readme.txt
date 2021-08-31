COHORT ID- INTQEA21QE011

###Module -Epics

### Team Members:

1. Mohan Kumar S -909276
2. Subhasini Arumugam -909866
3. Karthikeyan P -909865
4. Vishnu K -909851
5. Sangeetha K -909864


### Case Study:
----------
Automate Mainspring Website's Epic Module

### Problem Statement:
-----------------
Automate Mainspring Website's Epic Module for given scenario
1.Add Epic using required data


### Automated site:
------------
https://pratesting.cognizant.com

### Getting Started:
------------
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Pre Requisites:
------------
What things you need to install 

1. Operating System- Windows 10.
2. JDK 8
3. Eclipse IDE
4. Download Apache Maven 3.8.1

### Detailed Description:
-------------------
1. Launch the Google Chrome browser.
2. Open URL: https://pratesting.cognizant.com.
3. Sign in by entering credentials and OTP.
4. Click on Hamburger Button on top left corner and select 'CFO_Onsite' under Project/Program.
5. Click on 'EPIC' under 'Execute' in top menu.
6. Click on 'Add' Button.
7. Pass the details and fill the form. 
8. Click on save button.
9.Close the browser.

### Key Automation Scope:
-----------------
* Automation Concepts, Selenium Configuration, Web driver Basics
* Object Identification
* Page factory
* Relative XPath
* Page Object Model
* Page Factory
* Cucumber
* Data Driven Approach
* TESTNG
* KeyWord Driven Approach
* Reusable method creation
* Custom Report
* Implicit/Explicit/Fluent Waits used

### File Specifications:
----------------------
*There is 6 package in the src/main/java folder.
1. BaseClass contains 1 class
        PageBase.java:This file contains common method and browser initilization method.

2. Pages contains 3 classes
        LandingPage.java:This file contains click on cfo_onsite method which performs click operation.
        ProjectPage.java:This file contains click Epics method which performs click operation.
	EpicPage.java:This file contains the function required to create an epic.

3. Feature contains feature file
       	Feature.feature:This feature file contains the feature and scenarios. 

4. MyTestRunner contains 1 class
	TestRunner.java:This file contains cucumber testrunner.(we have to give the path of feature file).

5. StepDefinition contains 1 class
        TestCaseSteps.java:This file contains step definitions of the scenario of the Feature.featurefile.

6. utils contains 
        Constants.java:This file contains Time constants.
	CustomReports.java:This file generates customHtml Report.
	DateUtils.java:This file is for Date.
	ExtentReportManager.java:This file generate Extent Reports.


*in the src/test/java folder.
1. Keyword.Scenario contains Excel Sheet
	ExcelTest.xlsx:This file contains action keywords.

2. Engine contains a class
	KeywordEngine.java:This is used to perform Keyword Driven Approach.

3. Execute contains a class
	startExecute.java:This is used to run the test cases with the help of testng using data from excel sheet.

4. Test contains a class
	TestClass.java: This class methods to perform Automation.


*in the src/test/resources folder.
1. The Drivers folder contains: *Chrome driver - chromedriver.exe
                              *Firefox driver- geckodriver.exe

2. ObjectRepository contains: ProjectConfig.property file.


3.Excel data : FormDetails.xlsx:This sheet is used to provide data for form filling.

* Documentation folder consists of excel sheet regarding manual testing.

* Screenshoots folder consists screenshots saved EPIC.

* pom.xml file consists of all the dependencies related to our project.

* CustomReport folder contains CustomHtml Report.

* testreport.html- ExtentHtml Reports.

* test-output folder contains output reports.


### Mandatory Implementations:
-------------------------
1.Pageobject model
2.Page factory
3.Extent HTML Report generation
4.Data driven Approach
5.TESTNG
6.Cucumber
7.CustomHtml Reports
8.Implicit/Explicit/Fluent Waits used
----------------------



