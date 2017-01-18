# Getting started

* This project is implementation of Converter such that given a number between 0 and 1 billion it will represent the number in words.
* It is developed using TDD approach.

# Prerequisites
* This project will require below software to execute
1. Apache Maven 3.3.9(This version is not specifically required).
2. JDK 1.7(If you need to change the JDK version please do change it in pom.xml also).
3. You need to set MAVEN_HOME and JAVA_HOME variable in your host environment variables where you need to run the program.
4. Also you need to set PATH variable of your host environment variable.

# Assumptions
* User will enter a number only between 0 and 1 billion.
* User will not enter a negative number.
* This project does not use any standard Java API to perform conversion.

# Project build instructions
* Import the project into Eclipse by selecting option "Importing Existing Maven project into workspace".
* Ensure prerequisites are fulfilled as mentioned above.
* Checkout the project using git repository URL [https://github.com/nitinprabhu/numbertowords.git](https://github.com/nitinprabhu/numbertowords.git)
* Execute command `mvn clean install` from command line by navigating to project folder.
* This command will download all dependencies from Maven Repository and you should be able to execute the test cases from eclipse or command line.
