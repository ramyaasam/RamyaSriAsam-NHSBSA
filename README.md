
# nhs_selenium_bdd

<b><h2>Sample test project for validating new NHS eligbility checker tool.<b><h2>

<b><h3>Required dependencies to run this project<b><h3>

1.Java SE v8
2.Maven
3.Any IDE

<b><h3>Compile the project</b></h3>
mvn clean install -DskipTests


<b><h3>Run the tests</b></h3><br>
<b>The tests can be ran on Chrome and Firefox browser from command line by passing browser as a arguement as mentioned below.</b>

Run on chrome  --> mvn clean test -Dbrowser="chrome"
Run on Firefox --> mvn clean test -Dbroser="firefox"
