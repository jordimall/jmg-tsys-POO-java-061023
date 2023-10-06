package Actividad_01;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private enumGenero sexo;
	private double peso;
	private double altura;

	private final String NOMBRE_DEFECTO = "";
	private final int EDAD_DEFECTO = 0;
	private final enumGenero GENERO_DEFECTO = enumGenero.H;
	private final double PESO_DEFECTO = 0;
	private final double ALTURA_DEFECTO = 0;

	public Persona(String dni) {
		this.nombre = NOMBRE_DEFECTO;
		this.edad = EDAD_DEFECTO;
		this.dni = dni;
		this.sexo = GENERO_DEFECTO;
		this.peso = PESO_DEFECTO;
		this.altura = ALTURA_DEFECTO;
	}

	public Persona(String nombre, int edad, String dni, enumGenero sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = PESO_DEFECTO;
		this.altura = ALTURA_DEFECTO;
	}

	public Persona(String nombre, int edad, String dni, enumGenero sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public enumGenero getSexo() {
		return sexo;
	}

	public void setSexo(enumGenero sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}
