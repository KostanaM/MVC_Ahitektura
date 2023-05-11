package mvc_arhitektura;

//klasa koja predstavlja model

public class Employee {

	// deklarisanje promenljivih
	private String EmployeeName;
	private String EmployeeId;
	private String EmployeeDepartment;

	// definisanje getter i setter metoda
	public String getId() {
		return EmployeeId;
	}

	public void setId(String id) {
		this.EmployeeId = id;
	}

	public String getName() {
		return EmployeeName;
	}

	public void setName(String name) {
		this.EmployeeName = name;
	}

	public String getDepartment() {
		return EmployeeDepartment;
	}

	public void setDepartment(String Department) {
		this.EmployeeDepartment = Department;
	}

}