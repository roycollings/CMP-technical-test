# Wikipedia test automation

## Pre requisites
Maven 3.5+ must be installed.

## Execution
From the command line, type  

  `mvn package`

## Notes

- I've used Maven as a test execution tool to reduce the risk of platform dependency.
- The applicaton url uder test is defined in the pom.xml file (in this case, `<applicationUrl>https://www.wikipedia.org</applicationUrl>`).
- The test run will output to both stdout and to an 'Extents report' found under `./reports/index.html` (relative to this file). 
The report gives a lot of information, including the OS / username / selenium version etc... - clicking the dashboard icon on the report
will give a more expanded view of the test result.
A sample of the report has been left there for you (in case you have issues running the test).
- As described in the task, the test case is a very simple one, but I used a 'Background' in the feature file assuming that any scenarios
described in that feature would be against the application (not api etc...).