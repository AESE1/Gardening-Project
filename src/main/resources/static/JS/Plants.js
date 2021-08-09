const PtTable = `<div class="plant">
				<table style="width:80%">
			    <tr>
				<th>ID</th>
				<th>Name</th>
				<th>Price</th>
                <th>Size</th>
                <th>Variegated</th>
				<tr>`;
const PbTable = `</table>
				</div>`;

function showDB() {
    const body = document.body;
    const para = document.createElement('p');
    body.append(para);
    fetch("http://localhost:9002/read")
.then(response => response.json())
.then(data => console.log(data))
}
