let request = require('request-promise');
let fs = require('fs');
let assert = require('assert');

let passed = 0;
let failed = 0;
let total = 0;

let url = 'http://api.giphy.com/v1/gifs/search';

fs.readFile("tests.json", 'utf8', function (err, data) {
  if (err) {
    console.log(err);
    process.exit(1);
  }

  jsonData = JSON.parse(data);

  let promises = [];

  for (let suite of jsonData.suites) {
    for (let test of suite.tests) {

      total = total + 1;

      promises.push(
        request.get(url + test.parameterss)
          .then(body => {
            jsonBody = JSON.parse(body);
            testExpected(jsonBody, test);
          })
          .catch(err => {
            testExpected(err, test);
          })
      );
    }
  }

  return Promise.all(promises)
    .then((results) => {
      console.log("\nTotal:", total, "Passed:", passed, "Failed:", failed);
      return results;
    })
});

function testExpected(result, test) {

  if ("meta" in result) {
    let status = result.meta.status;

    if (failTest(test.description + " (status)", test.expected.status, status)) {
      return false;
    }
  }

  if (result.hasOwnProperty('pagination')) {
    let totalCount = result.pagination.total_count;
    let count = result.pagination.count;
    let offset = result.pagination.offset;

    if (failTest(test.description + " (total count)", test.expected.totalCount, totalCount)) {
      return false;
    }

    if (failTest(test.description + " (offset)", test.expected.offset, offset)) {
      return false;
    }

    if (failTest(test.description + " (count)", test.expected.count, count)) {
      return false;
    }
  }

  passTest(test.description);
}

function failTest(description, expected, actual) {
  if (undefined == expected || undefined == actual){
    return false;
  }

  if (expected != actual) {
    failed = failed + 1;
    console.log(description, ": failed (expected '" + actual + "' to be '" + expected + "')");
    return true;
  }
  return false;
}

function passTest(description) {
  passed = passed + 1;
  console.log(description, ": passed");
}