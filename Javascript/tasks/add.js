function addEmployee() {
    var id = document.getElementById("employeeId").value;
    var name = document.getElementById("employeeName").value;
    var designation = document.getElementById("employeeDesignation").value;
    var salary = document.getElementById("employeeSalary").value;

    // Validate input
    if (!id || !name || !designation || !salary) {
        alert("Please fill in all fields");
        return;
    }

    // Create a new row in the table
    var table = document.getElementById("employeeRecords");
    var newRow = table.insertRow(table.rows.length);
    // Insert cells into the new row
    var cell1 = newRow.insertCell(0);
    var cell2 = newRow.insertCell(1);
    var cell3 = newRow.insertCell(2);
    var cell4 = newRow.insertCell(3);

    // Populate cells with input values
    cell1.innerHTML = id;
    cell2.innerHTML = name;
    cell3.innerHTML = designation;
    cell4.innerHTML = salary;

    // Clear the form fields
    document.getElementById("employeeForm").reset();
}