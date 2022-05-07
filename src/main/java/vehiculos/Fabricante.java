package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {

	// CLASS VARIABLES
	private static HashMap<String, Integer> ventas = new HashMap<String, Integer>();
	
	
	// INSTANCE VARIABLES
	private String nombre;
	private Pais pais;
	
	
	// CONSTRUCTORS
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		
		if(ventas.get(nombre) == null) {
			ventas.put(nombre, 1);
		} else {
			ventas.replace(nombre, ventas.get(nombre) + 1);
		}
	}
	
	
	// CLASS METHODS
	public static String fabricaMayorVentas() {
		String fabricaMayorVentas = "";
		
		for (Map.Entry<String, Integer> fabrica : ventas.entrySet()) {
			if(fabricaMayorVentas == "") {
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
