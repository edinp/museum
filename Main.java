package ba.bitcamp.day48.test.zaid;

public class Main {

	public static void main(String[] args) {

		Museum m = new Museum("Museum 1");

		Exponat exp1 = new Exponat(1, "Figura", "Prekrasna figura");
		Exponat exp2 = new Exponat(4, "Kipic", "Prastari kineski kip");
		Exponat exp3 = new Exponat(5, "Nakit", "Skupocjeni nakit kraljice Katarine");

		Arts art1 = new Arts(2, "Monalisa", "Strasno djelo Mikelandjela", "Michelangelo", Arts.era.CONTEMPORARY);
		Arts art2 = new Arts(6, "Starac", "Jedinstveno djelo Berbera", "Berber", Arts.era.MODERN);
		Arts art3 = new Arts(7, "More", "Zalazak sunca", "Safet Zec", Arts.era.NEOCLASSIC);

		Historic his1 = new Historic(3, "Stecak", "Stari stecak iz srednjovjekovne Bosne", "Hercegovina", Historic.time.MODERN_AGE);

		Employee emp1 = new Employee("Edin Pilavdzic", 1500);
		Employee emp2 = new Employee("Azra Pilavdzic", 4000);
		Employee emp3 = new Employee("Omar Pilavdzic", 10000);

		m.addExponat(exp1);
		m.addExponat(exp2);
		m.addExponat(exp3);
		
		m.addArts(art1);
		m.addArts(art2);
		m.addArts(art3);
		
		m.addHistoric(his1);

		m.addEmployee(emp1);
		m.addEmployee(emp2);
		m.addEmployee(emp3);
		
		m.printEmployees();
		m.printExponats();
		m.printArts();
		m.printHistoric();

		System.out.println("MUSEUM: " + m);

		System.out.println("Exponat: " + exp1.fitsSearch("Prekrasna"));

		System.out.println("Exponat: " + exp1.fitsSearch("1"));

		System.out.println("Art: " + art1.fitsSearch("djelo"));

		System.out.println("Employee: " + emp1.fitsSearch("1500"));
		
	}

}
