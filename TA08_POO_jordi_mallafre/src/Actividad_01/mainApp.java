package Actividad_01;

public class mainApp {

	public static void main(String[] args) {
		Persona per1 = new Persona("11111111A");
		System.out.println(per1);
		
		Persona per2 = new Persona("Jordi", 28, "22222222B", enumGenero.H);
		System.out.println(per2);
		
		Persona per3 = new Persona("Laura", 23, "33333333C", enumGenero.M, 42.15, 1.73);
		System.out.println(per3);

	}

}
