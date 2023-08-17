# ScoreMedia
Appium code to test ScoreMedia Android App using Appium

A. **Prerequisites**

1. Appium (cli) version 2.0.1 (install appium using npm with this command **npm i --location=global appium**)
2. uiautomator2@2.29.4 (install latest with command **appium driver install uiautomator2**) 
<img width="284" alt="image" src="https://github.com/EarlFernandes/ScoreMedia/assets/48104035/798a1336-77bb-4ccf-b35f-1a35e374775d">

More info on installing uiautomator2 here --> https://appium.io/docs/en/2.0/quickstart/uiauto2-driver/

3. Download Android SDK platform tools. You will probably want to download Android Studio and manage the SDK tools from within it for the easiest experience.
4. Java openjdk 17.0.5 2022-10-18
OpenJDK Runtime Environment Temurin-17.0.5+8 (build 17.0.5+8)
OpenJDK 64-Bit Server VM Temurin-17.0.5+8 (build 17.0.5+8, mixed mode)
5. Install Maven on MacOS For documentation to install Maven please look here --> https://www.baeldung.com/install-maven-on-windows-linux-mac#installing-maven-on-mac-os-x
6. Configure your Device name and Android version on which you intend to run the test in src/main/java/org.example/baseclass.java file and save the file
7. Make sure ScoreMedia app is installed on your device
   

B. **Running the test**

1. Connect the android device to the computer and make sure USB settings have been set to Transferring files / Android Auto mode on the device (more info on this here https://www.embarcadero.com/starthere/xe5/mobdevsetup/android/en/enabling_usb_debugging_on_an_android_device.html)
2. Make sure any fingerprint / pattern / password authentication is disabled / provided before running the test else the test will not initiate.
3. Once the code has been pulled to your local repository navigate to the location of the pom.xml file in your terminal
4. Make sure Appium is installed in the same folder or that the environment variable is set to run Appium from anywhere in terminal
5. Run this command in your terminal **maven clean test** and watch the test launch onto your device to test the ScoreMedia app

C. **Analyzing the test run**

1. Open the ScoreMedia/target/surefire-reports/emailable-report.html file to check test results
2. On the terminal the text displayed should also show verification of the 4 items from the test run as below if they were verified correctly.
   a. NBA is displayed in Title indicating the League (NBA) is selected correctly.
   b. Standings tab is selected correctly as expected
   c. Content is correct and related to NBA league
   d. Leagues is displayed in Title indicating back navigation returns you to the previous page (Leagues) correctly.

**Approach towards this framework**

1. Pageobject Model has been adopted as it is the most favoured framework for testing using Selenium. Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository for storing all web elements. It helps reduce code duplication and improves test case maintenance. In Page Object Model, consider each web page of an application as a class file. Each class file will contain only corresponding web page elements. Using these elements, testers can perform operations on the website under test.
Advantages: Easy Maintenance, Code reusability, Readability and Reliability of Scripts.

2. Pagefactory: Reduced code duplication: Page Factory allows for more concise and reusable Page Objects. This reduces the amount of boilerplate code required to create and maintain Page Objects, leading to less code duplication and better code maintainability. Improved code readability: Page Factory makes the automation code more readable by separating the initialization of web elements from the test code. This makes it easier to understand the intent of the code and the interactions with the web page.

3. Java - since most selenium and it's supportive libraries are provided in Java / Kotlin, I have used Java as the primary language for this framework.

4. TestNG - TestNG is useful to organize the tests with @BeforeClass @AfterClass @Test and @DataProvider annotations for making the test data driven (currently I have only shown the usage of Data provider using parameters from a separate method but this is easily achievable to pass data even from an Excel sheet. I only configured the data Provider since 1. For the bonus points 2. To show that using excel is a similar approach and I have configured it before in the same manner reading the excel file and it's data using Java code.

   **For any clarification regarding the ^ above process please reach out to my email earlspen2001@gmail.com**



