# NopCommerce Automation Framework

This is an automation framework for the NopCommerce website. The framework uses a combination of various technologies and design patterns to provide a robust, scalable, and easy-to-use platform for writing automated tests.

## Technologies Used

- **Java**: The core programming language used for writing test scripts.
- **Maven**: A build automation tool used for managing project dependencies.
- **TestNG**: A testing framework used for managing test cases and generating test reports.
- **Extent Reports**: A reporting library used for creating interactive and detailed test reports.
- **Data-Driven Testing (DDT)**: A design approach where test data is read from a properties file.

## Design Patterns Used

- **Page Object Model (POM)**: A design pattern that improves test maintenance and reduces code duplication. Each web page is represented as a class, and the various elements on the page are defined as variables on the class. All possible user interactions can then be implemented as methods on the class.

## Installation

1. Clone the repository: `git clone https://github.com/username/project.git`
2. Navigate to the project directory: `cd project`
3. Install the dependencies: `mvn install`

## Usage

To run the tests, open testng file and click run 

## Features

- **Properties File**: Test data is read from a properties file, allowing for easy updates to the test data without needing to change the test code.
- **Screenshot on Failure**: The framework captures a screenshot whenever a test fails, providing a visual reference for the failure.
- **POM File**: The `pom.xml` file contains all the project dependencies. This file needs to be reloaded to download all dependencies on another machine.

