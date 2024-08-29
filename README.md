[Readme.md](https://github.com/user-attachments/files/16803893/Readme.md)
Parabank Web Automation Project Overview This project is an automated
test suite for the Parabank website, developed using Java and Selenium
WebDriver. The primary goal of this project is to automate the
functional and regression testing of the Parabank online banking
platform.

Table of Contents Overview Features Technology Stack Project Structure
Setup Instructions Running Tests Test Reports Continuous Integration
Contributing License Contact Features

Automated testing of core banking functionalities such as account
creation, fund transfer, bill payment, and loan requests. Page Object
Model (POM) design pattern implementation. Test execution using TestNG
(or JUnit). Test reports generation using Surefire (for TestNG) or
Allure (for more detailed reports). Cross-browser testing support.
Technology Stack Programming Language: Java Automation Framework:
Selenium WebDriver Testing Framework: TestNG or JUnit Build Tool: Maven
Reporting: Surefire Plugin, Allure (optional) Version Control: Git
Continuous Integration: Jenkins (Optional) Project Structure css Copy
code ├── src │ ├── main │ │ ├── java │ │ │ └── com │ │ │ └── parabank │
│ │ └── pages │ │ ├── resources │ └── test │ ├── java │ │ └── com │ │
└── parabank │ │ └── tests │ ├── resources │ └── testng.xml (or JUnit
runner) ├── pom.xml └── README.md

src/main/java: Contains the Page Object classes for different Parabank
pages. src/test/java: Contains the test classes with TestNG/JUnit test
cases. src/test/resources: Contains test data and configurations.
pom.xml: Maven configuration file. Setup Instructions Prerequisites Java
Development Kit (JDK) 8+ Maven (for dependency management) Git (for
version control)
