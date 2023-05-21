package obc_ejercicioTema9;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(38, "Juan", "659999987",12000);		
		System.out.println("CLIENTE--------------------");
		cliente.mostrarPersona();
		
		Trabajador trabajador = new Trabajador(42, "Adam", "655212121", 1600);
		System.out.println("TRABAJADOR--------------------");
		trabajador.mostrarPersona();
	}

}


