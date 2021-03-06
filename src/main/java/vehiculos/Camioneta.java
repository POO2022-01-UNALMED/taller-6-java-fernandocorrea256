package vehiculos;

public class Camioneta extends Vehiculo{

	// CLASS VARIABLES
	private static int cantidadCamionetas = 0;
	
	// INSTANCE VARIABLES
	private boolean volco;
	
	// CONSTRUCTORS
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	// GETTERS & SETTERS
	public static int getCantidadCamionetas() { return cantidadCamionetas; }
	public static void setCantidadCamionetas(int cantidad) { cantidadCamionetas = cantidad;}
		
	
	public boolean isVolco() { return this.volco; }
	public void setVolco(boolean volco) { this.volco = volco; }
	
}
