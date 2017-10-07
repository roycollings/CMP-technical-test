let getResponse = require('./getResponse');
let responseTestPasses = require('./responseTestPasses');
let colors = require('colors');

module.exports = (data) => {
  jsonData = JSON.parse(data);

  let promises = [];
  let total = 0;
  let passed = 0;
  let failed = 0;

  console.log('\n');

  for (let suite of jsonData.suites) {
    for (let test of suite.tests) {
      total = total + 1;

      promises.push(getResponse(test)
        .then((response) => {

          if (responseTestPasses(response, test)) {
            console.log(test.description, ':', 'passed'.green);
            passed = passed + 1;
          } else {
            console.log(test.description, ':', 'failed'.red);
            failed = failed + 1;
          }

        })
      );
    }
  }

  return Promise.all(promises)
    .then((results) => {
      console.log('\nTotal:'.bold, total, 'Passed:'.bold, passed, 'Failed:'.bold, failed);

      if (0 < failed) {
        console.log('\nTest run failed\n'.bold.red);
      } else {
        console.log('\nTest run passed\n'.bold.green);
      }
      return results;
    })
};