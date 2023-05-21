package obc_ejercicioTema9;

public class Trabajador extends Persona{

	private int salario;
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Trabajador(int edad, String nombre, String telefono, int salario) {
		super(edad, nombre, telefono);
		this.salario = salario;
	}

	@Override
	public void mostrarPersona() {
		super.mostrarPersona();
		System.out.println(salario);
	}
	
}
