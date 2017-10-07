# Description
The tests are described in `tests.json` and can be added to simply. 

The automation script here is very simple (it was just the easiest way to run multiple api tests), 
but will run the tests asynchronously for speed and can be built upon if need be (to inlude proper reporting etc...).

I've used NodeJs as a test execution tool in this case because it's very simple to set up for API tests and to reduce the risk of platform dependency.


# Pre requisites
Node 6+ must be installed.

# Execution
```
npm install
npm test
```
