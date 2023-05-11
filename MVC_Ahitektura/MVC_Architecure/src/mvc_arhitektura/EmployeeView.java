package mvc_arhitektura;

//klasa koja predstavlja pogled

public class EmployeeView {

	// metod za prikaz detalja o zaposlenima
	public void printEmployeeDetails(String EmployeeName, String EmployeeId, String EmployeeDepartment) {
		System.out.println("Podaci o zaposlenima: ");
		System.out.println("Ime: " + EmployeeName);
		System.out.println("ID zaposlenog: " + EmployeeId);
		System.out.println("Odeljenje: " + EmployeeDepartment);
	}
}