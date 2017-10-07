let request = require('request-promise');

let url = 'http://api.giphy.com/v1/gifs/search';

module.exports = (test) => {
  return request.get(url + test.parameters)
    .then(body => {
      jsonBody = JSON.parse(body);
      return jsonBody;
    })
    .catch(err => {
      return err;
    });
}