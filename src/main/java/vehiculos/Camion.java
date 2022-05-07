package vehiculos;

public class Camion extends Vehiculo{
	
	// CLASS VARIABLES
	private static int cantidadCamiones = 0;

	// INSTANCE VARIABLES
	private int ejes;
	
	
	// CONSTRUCTORS
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 80, 2, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		cantidadCamiones++;
	}
	
	// GETTERS & SETTERS
	public static int getCantidadCamiones() { return cantidadCamiones; }
	public static void setCantidadCamiones(int cantidad) { cantidadCamiones = cantidad;}
	
	
	public int getEjes() { return this.ejes; }
	public void setEjes(int ejes) { this.ejes = ejes; }
	
}
