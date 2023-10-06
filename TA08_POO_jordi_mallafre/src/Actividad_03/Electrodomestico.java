package Actividad_03;

public class Electrodomestico {
	private double precio;
	private enuColor color;
	private enuConsumoEnergetico consumo_energetico;
	private double peso;

	private final enuColor COLOR_DEFECTO = enuColor.blanco;
	private final enuConsumoEnergetico CONS_ENER_DEFECTO = enuConsumoEnergetico.F;
	private final double PRECIO_DEFECTO = 100;
	private final double PESO_DEFECTO = 5;

	public Electrodomestico() {
		this.precio = PRECIO_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumo_energetico = CONS_ENER_DEFECTO;
		this.peso = PESO_DEFECTO;
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.color = COLOR_DEFECTO;
		this.consumo_energetico = CONS_ENER_DEFECTO;
		this.peso = peso;
	}

	public Electrodomestico(double precio, enuColor color, enuConsumoEnergetico consumo_energetico, double peso) {
		this.precio = precio;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public enuColor getColor() {
		return color;
	}

	public void setColor(enuColor color) {
		this.color = color;
	}

	public enuConsumoEnergetico getConsumo_energetico() {
		return consumo_energetico;
	}

	public void setConsumo_energetico(enuConsumoEnergetico consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + "€, color=" + color + ", consumo_energetico=" + consumo_energetico
				+ ", peso=" + peso + "]";
	}

}
