let fs = require('fs');
let processFileData = require('./nodeMethods/processFileData');

fs.readFile("tests.json", 'utf8', function (err, data) {
  if (err) {
    console.log(err);
    process.exit(1);
  }

  return processFileData(data);
});