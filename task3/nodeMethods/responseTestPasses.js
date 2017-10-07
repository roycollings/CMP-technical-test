module.exports = (actualResult, test) => {

  let expectedResult = test.expected;

  for (parentKey in expectedResult) {
    if (!checkKeyValuesMatch(expectedResult[parentKey], actualResult[parentKey])) {
      return false;
    }
  }

  return true;
}

function checkKeyValuesMatch(expectedResult, actualResult) {
  for (key in expectedResult) {
    if (undefined != actualResult)
      if (expectedResult[key] != actualResult[key]) {
        return false;
      }
  }

  return true;
}