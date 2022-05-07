package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {

	// CLASS VARIABLES
	private static HashMap<Fabricante, Integer> ventas = new HashMap<Fabricante, Integer>();
	
	
	// INSTANCE VARIABLES
	private String nombre;
	private Pais pais;
	
	
	// CONSTRUCTORS
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	
	// CLASS METHODS
	public static void ventaFabricante(Fabricante fabricante) {
		Pais.ventaPais(fabricante.getPais());
		
		if(ventas.get(fabricante) == null) {
			ventas.put(fabricante, 1);
		} else {
			ventas.replace(fabricante, ventas.get(fabricante) + 1);
		}
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricaMayorVentas = null;
		
		for (Map.Entry<Fabricante, Integer> fabrica : ventas.entrySet()) {
			if(fabricaMayorVentas == null) {
				fabricaMayorVentas = fabrica.getKey();
			} else if(fabrica.getValue() > ventas.get(fabricaMayorVentas)) {
				fabricaMayorVentas = fabrica.getKey();
			}
		}
		
		return fabricaMayorVentas;
	}
	
	
	// GETTERS & SETTERS
	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre ) { this.nombre = nombre; }
	
	public Pais getPais() { return this.pais; }
	public void setPais(Pais pais ) { this.pais = pais; }
}
