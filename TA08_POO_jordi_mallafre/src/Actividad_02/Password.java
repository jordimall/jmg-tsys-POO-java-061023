package Actividad_02;

public class Password {
	private int longitud;
	private String contraseña;

	private final int LONGITUD_DEFECTO = 8;

	public Password() {

		this.longitud = LONGITUD_DEFECTO;
		this.contraseña = this.GenerarPassword(LONGITUD_DEFECTO);
	}

	public Password(int longitud) {

		this.longitud = longitud;
		this.contraseña = this.GenerarPassword(longitud);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

	private String GenerarPassword(int longitud) {
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String password = "";
		for (int i = 0; i < longitud; i++) {
			int posicion = (int) (Math.random() * caracteres.length());
			char caracterAleatorio = caracteres.charAt(posicion);
			password += caracterAleatorio;

		}
		return password;
	}
}
