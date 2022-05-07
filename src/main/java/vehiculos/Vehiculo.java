package vehiculos;

public class Vehiculo {
	
	// CLASS VARIABLES
	private static int cantidadVehiculos = 0;
	
	
	// CONSTRUCTORS
	public Vehiculo() {
		cantidadVehiculos++;
	}
	
	public Vehiculo(String placa, int velocidadMaxima, int puertas, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.nombre = nombre;
		this.traccion = traccion;
		this.precio = precio;
		this.puertas = puertas;
		this.fabricante = fabricante;
		cantidadVehiculos++;
	}
	
	// CLASS METHODS
	public static String vehiculosPorTipo() {
		String msg = "Automoviles: "+ Automovil.getCantidadAutomoviles() +  "\n"
				+ "Camionetas: " + Camioneta.getCantidadCamionetas() + "\n"
				+ "Camiones: " + Camion.getCantidadCamiones() + "\n";
		return msg;
	}
	
	
	// INSTANCE VARIABLES
	private String placa;
	private String nombre;
	private String traccion;
	private int precio;
	private int puertas;
	private int velocidadMaxima;
	private int peso;
	private Fabricante fabricante;
	
	
	// GETTERS & SETTERS
	public static int getCantidadVehiculos() { return cantidadVehiculos; }
	public static void setCantidadVehiculos(int cantidadVehiculos) { Vehiculo.cantidadVehiculos = cantidadVehiculos; }
	
	
	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public String getPlaca() { return this.placa; }
	public void setPlaca(String placa) { this.placa = placa; }

	public String getTraccion() { return this.traccion; }
	public void setTraccion(String traccion) { this.traccion = traccion; }
	
	public int getPuertas() { return this.puertas; }
	public void setPuertas(int puertas ) { this.puertas = puertas; }

	public int getVelocidadMaxima() { return this.velocidadMaxima; }
	public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

	public int getPrecio() { return this.precio; }
	public void setPrecio(int precio) { this.precio = precio; }
	
	public int getPeso() { return this.peso; }
	public void setPeso(int peso) { this.peso = peso; }
	
	public Fabricante getFabricante() { return this.fabricante; }
	public void setFabricante(Fabricante fabricante) { this.fabricante = fabricante; }
	
}
