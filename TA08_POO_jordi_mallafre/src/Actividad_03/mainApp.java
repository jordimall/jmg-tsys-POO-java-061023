package Actividad_03;

public class mainApp {

	public static void main(String[] args) {
		Electrodomestico elec1 = new Electrodomestico();
		System.out.println(elec1);
		
		Electrodomestico elec2 = new Electrodomestico(250.26, 15.85);
		System.out.println(elec2);
		
		Electrodomestico elec3 = new Electrodomestico(125.85, enuColor.rojo, enuConsumoEnergetico.A, 25.12);
		System.out.println(elec3);

	}

}
