# Automation Practice Selenium Framework

## Overview
This project is a test automation framework built with Selenium WebDriver, Java, TestNG, and Maven. It implements the Page Object Model (POM) design pattern to automate test scenarios on the [Automation Practice](http://automationpractice.com/) e-commerce website.

## Project Structure
```
├── src
│   ├── main/java/pages      # Page object classes
│   │   ├── AddressPage.java
│   │   ├── DressesPage.java
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── OrderPage.java
│   │   └── PrintedDressPage.java
│   └── test/java/test       # Test classes
│       ├── BaseTest.java
│       └── RegisterTest.java
└── pom.xml                  # Maven configuration
```

## Technologies Used
- Java 8
- Selenium WebDriver 4.2.2
- TestNG 7.5
- Maven

## Design Pattern
The project uses the Page Object Model (POM) design pattern which:
- Separates page-specific code from test code
- Creates an abstraction layer for UI interactions
- Improves test maintainability
- Reduces code duplication

## Current Test Scenarios
1. **E-commerce Purchase Flow Test**
   - Navigate to the Dresses section
   - Select a printed dress
   - Set quantity and size
   - Add to cart
   - Proceed to checkout
   - Register a new account
   - Complete registration with personal details

## How to Run Tests
1. Clone this repository
2. Update ChromeDriver path in `BaseTest.java` to match your local path
3. Execute tests using one of these methods:
   - Run with Maven: `mvn test`
   - Run with TestNG in your IDE
   - Run specific test classes directly

## Prerequisites
- Java 8+ JDK installed
- Maven installed
- Chrome browser installed
- ChromeDriver matching your Chrome version

## Setting Up ChromeDriver
Update the path in `BaseTest.java`:
```java
System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
```

## Future Enhancements
- Add more test scenarios
- Implement reporting (Extent Reports, Allure)
- Add screenshot capture on test failure
- Implement cross-browser testing
- Add CI/CD integration
- Parameterize test data

## Contributing
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
