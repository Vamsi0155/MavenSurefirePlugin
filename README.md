#MavenSurefirePlugin 
#MavenProfile

This repository will help you to execute Maven Project from Command Line Prompt and 
also to execute required testng.xml file from Command Line Prompt when in working with multiple testng.xml files.

#Maven Surefire Plugin

Pre-Requisites:
Maven Jar Files must be downloaded and path must be set for the same in System Environment Variables.

To Execute Maven Project from Command Line Prompt, we need Maven Surefire Plugin which you will find in pom.xml file.

#Maven Profile Concept

In general, if we do not use Maven Profiling when in working with multiple testng.xml files. 
Each time we need to go to pom.xml file and change the name of testng.xml file in Maven Surefire Plugin which needs to be executed,
which is very tedious task to do every time.
so, it is a good practice to implement Maven Profile Concept when in working with multiple testng.xml files.

[Multiple testng.xml files >> We maintain sanity_testng.xml, smoke_testng.xml, regresssion_testng.xml].

