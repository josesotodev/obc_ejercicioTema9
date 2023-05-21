package obc_ejercicioTema9;

public class Persona {

	private int edad;
	private String nombre;
	private String telefono;
	
	public Persona (int edad, String nombre, String telefono){
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void mostrarPersona() {
		System.out.println(edad);
		System.out.println(nombre);
		System.out.println(telefono);
	}
}
