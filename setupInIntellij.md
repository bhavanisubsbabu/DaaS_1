Steps:

Pre- requisites:

-Download JAVA jdk( The right version required for the project)and save  in the local system
-Reference the downloaded Jdk in Advanced Systems Setting < environment Variable – as JAVA_HOME
-Download MAVEN and save in the local system
-Reference the downloaded Maven in Advance System settings < Environment Variable – As M2_HOME & MAVEN_HOME
Links for reference:

https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html
https://www.mkyong.com/maven/how-to-install-maven-in-windows/

Steps : To Download IntelliJ and set up Mapmaker project

1)Download IntelliJ

2)Open with Default settings

3)Use “Project from version control” link in IntelliJ to import project from Git/Stash repository

Or “Project from Existing resource” ( If the Project is in the local system)

Note –

-To access stash you need ssh key. This can be generated following instructions in the below site:

https://confluence.atlassian.com/bitbucketserver/creating-ssh-keys-776639788.html

This is just one time exercise.

4)After completing step 3 - Mapmaker-acceptancetest project should display under Projects in IntelliJ

5)The project cloned from the repository ( git/Stash) is configured to run on a Virtual Machine.
To Run tests locally, in the project open OsMapMaker.properties and under “Virtual & Local Machine”
add a variable to reference your local system ND number ( Ex – AB_Chrome=http://nd11111:4444/wd/hub)

6)Windows Command script files – HUB & NODE, should be saved in the local system ( Where to get these from? )

In the Node file, enter Local system ND number ( Ex - -hub http://nd27574:4444/grid/register)
7)Download Chrome Driver in your local system

8)Configure Run in intelliJ :
Navigate to Run< Run configuration< + Maven 
Ex for command line ( change the tag to smoke or regression or any other test tag as required):
  
  COMMAND LINE : clean "-Dcucumber.options=--tags   @AddMarkerToDataLayer" -Dbrowser=chromebb install




