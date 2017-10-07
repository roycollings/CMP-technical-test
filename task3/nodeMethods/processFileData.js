let getResponse = require('./getResponse');
let responseTestPasses = require('./responseTestPasses');

module.exports = (data) => {
  jsonData = JSON.parse(data);

  let promises = [];
  let total = 0;
  let passed = 0;
  let failed = 0;

  for (let suite of jsonData.suites) {
    for (let test of suite.tests) {
      total = total + 1;
      promises.push(getResponse(test)
        .then((response) => {
          if (responseTestPasses(response, test)) {
            console.log(test.description, ": passed");
            passed = passed + 1;
          } else {
            console.log(test.description, ": failed");
            failed = failed + 1;
          }
        })
      );
    }
  }

  return Promise.all(promises)
    .then((results) => {
      console.log("\nTotal:", total, "Passed:", passed, "Failed:", failed);
      return results;
    })
};