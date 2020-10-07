
# nhs_selenium_bdd

Sample test project for validating new NHS eligbility checker tool.

Required dependencies to run this project

1.Java SE v8
2.Maven
3.Any IDE

Compile the project
--> mvn clean install -DskipTests


Run the tests
The tests can be ran on Chrome and Firefox browser from command line by passing browser as a arguement as mentioned below.

Run on chrome  --> mvn clean test -Dbrowser="chrome"
Run on Firefox --> mvn clean test -Dbroser="firefox"
