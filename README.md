## OSMapMaker

This build is for running Acceptances tests for Resilience Direct using CucumberJvm.


Git checkout https://stash.ordsvy.gov.uk/scm/map/mapmaker-acceptancetest.git

Password: windows user credentials
    
�We can run before and �@After for each scenario�s({ "@smoke" })

### Use Maven

Open a command prompt window navigate to the workspace location and run:

mvn -P selenium-tests clean -Dbrowser=chrome install(change the browser name for cross browser testing)

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCukesTest`
class tells JUnit to kick off Cucumber.

### tags from command line

mvn clean -Dcucumber.options="--@tag" -Dbrowser=chromeVM install


### tags from Run configuration

#Workspace
Choose workspace mapmaker

#Goals
mvn clean -Dcucumber.options="--tags @createamapfromDashBoard" -Dbrowser=chromeRN install

#Profiles
-P selenium-tests clean

###### browsers ###########
ie10
ie11
edge
safari
firefox
phantomjs
chromeVM
chromeRN
chromeRA
htmlunitdriver
