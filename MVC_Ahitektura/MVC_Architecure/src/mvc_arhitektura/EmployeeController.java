package mvc_arhitektura;

//klasa koja predstavlja kontroler 

public class EmployeeController {

	// deklarisanje promenljivih modela i pogleda
	private Employee model;
	private EmployeeView view;

	// konstruktor za inicijalizaciju
	public EmployeeController(Employee model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}

	// getter i setter metode
	public void setEmployeeName(String name) {
		model.setName(name);
	}

	public String getEmployeeName() {
		return model.getName();
	}

	public void setEmployeeId(String id) {
		model.setId(id);
	}

	public String getEmployeeId() {
		return model.getId();
	}

	public void setEmployeeDepartment(String Department) {
		model.setDepartment(Department);
	}

	public String getEmployeeDepartment() {
		return model.getDepartment();
	}

	// metod za ažuriranje prikaza
	public void updateView() {
		view.printEmployeeDetails(model.getName(), model.getId(), model.getDepartment());
	}
}