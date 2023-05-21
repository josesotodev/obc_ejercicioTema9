package obc_ejercicioTema9;

public class Cliente extends Persona{

	private int credito;

	public Cliente(int edad, String nombre, String telefono, int credito) {
		super(edad, nombre, telefono);
		this.credito = credito;
	}
	
	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
	
	@Override
	public void mostrarPersona() {
		super.mostrarPersona();
		System.out.println(credito);
	}
}
