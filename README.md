
# nhs_selenium_bdd

<b><h2>Sample test project for validating new NHS eligbility checker tool.<b><h2>

<b><h3>Required dependencies to run this project<b><h3>

1.Java SE v8
2.Maven
3.Any IDE

<b><h1>Compile the project</b></h1>
mvn clean install -DskipTests


<b><h1>Run the tests</b></h1><br>
<b>The tests can be ran on Chrome and Firefox browser from command line by passing browser as a arguement as mentioned below.</b>

Run on chrome  <br>clean test -Dbrowser="chrome"<br>
Run on Firefox <br>clean test -Dbroser="firefox"
