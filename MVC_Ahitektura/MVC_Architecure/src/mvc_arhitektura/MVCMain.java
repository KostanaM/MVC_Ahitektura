package mvc_arhitektura;

/*Model-View-Controller (MVC) je arhitekturalni patern koji se koristi u razvoju softvera.
 * U složenim aplikacijama koje prikazuju korisniku ogromne količine podataka programeri 
 * često žele da razdvoje kod koji se bavi podacima od onog koji se bavi interfejsom, tako
 * da razvoj oba postane lakši i jednostavniji. MVC rešava ovaj problem razdvajanjem 
 * podataka i biznis logike od njihovog prikaza i interakcije sa korisnikom, uz to uvodeći
 * i komponentu zaduženu za koordinisanje prve dve.Na njemu se zasnivaju neki od najpopularnijih 
 * frameworka i najviše se koristi u razvoju aplikacija i sajtova za web.
 * 
 * MVC se sastoji od tri celine:
 * Model - podaci i poslovna logika određene aplikacije
 * View - prikaz predhodno modeliranih podataka
 * Controller - upravlja korisničkim zahtjevima
 */

public class MVCMain {
	public static void main(String[] args) {

		// dohvaćanje zapisa zaposlenog na osnovu employee_id iz baze podataka
		Employee model = retriveEmployeeFromDatabase();

		// kreiranje prikaza za pisanje detalja o zaposlenima na konzoli
		EmployeeView view = new EmployeeView();

		EmployeeController controller = new EmployeeController(model, view);

		controller.updateView();

		// ažuriranje podataka
		controller.setEmployeeName("Ana");
		System.out.println("\nPodaci o zaposlenima nakon ažuriranja: ");

		controller.updateView();
	}

	private static Employee retriveEmployeeFromDatabase() {
		Employee Employee = new Employee();
		Employee.setName("Kostana");
		Employee.setId("11");
		Employee.setDepartment("Finansije i računovodstvo");
		return Employee;
	}
}