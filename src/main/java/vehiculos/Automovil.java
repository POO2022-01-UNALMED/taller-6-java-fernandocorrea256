package vehiculos;

public class Automovil extends Vehiculo{

	// CLASS VARIABLES
	private static int cantidadAutomoviles = 0;

	// INSTANCE VARIABLES
	private int puestos;
	
	// CONSTRUCTORS
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, nombre, "FWD", precio, 4, 100, peso, fabricante);
		this.puestos = puestos;
		cantidadAutomoviles++;
	}
	
	// GETTERS & SETTERS
	public static int getCantidadAutomoviles() { return cantidadAutomoviles; }
	public static void setCantidadAutomoviles(int cantidad) { cantidadAutomoviles = cantidad;}
		
	
	public int getPuestos() { return this.puestos; }
	public void setPuestos(int puestos) { this.puestos = puestos; }
	
}
