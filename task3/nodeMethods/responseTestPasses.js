module.exports = (result, test) => {

  if ("meta" in result) {
    let status = result.meta.status;

    if (test.expected.status != status) {
console.log('STATUS: ', test.expected.status, ' vs ', status);
      return false;
    }
  }

  if (result.hasOwnProperty('pagination')) {
    let totalCount = result.pagination.total_count;
    let count = result.pagination.count;
    let offset = result.pagination.offset;

    if (undefined != test.expected.totalCount && test.expected.totalCount != totalCount) {
      return false;
    }

    if (undefined != test.expected.offset && test.expected.offset != offset) {
      return false;
    }

    if (undefined != test.expected.count && test.expected.count != count) {
      return false;
    }
  }

  return true;
}