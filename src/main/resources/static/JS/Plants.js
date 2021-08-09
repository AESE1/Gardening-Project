let fishtable = document.querySelector('#fishtable');

function getData(url, callback) {
    let jsonData;
    fetch(url)
      .then((response) => response.json())
      .then((data) => {(jsonData = data);
         console.log(data)})
      .then(() => callback(jsonData))
      .catch((error) => console.log(error));
  }

getData('http://localhost:9002/read', createTable);

function createTable(tableData) {
    var table = document.createElement('table');
    var tableBody = document.createElement('tbody');