package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	// CLASS VARIABLES
	private static HashMap<String, Integer> ventasPaises = new HashMap<String, Integer>(); 
	
	// INSTANCE VARIABLES
	private String nombre;
	
	// CONSTRUCTORS
	public Pais(String nombre) {
		this.nombre = nombre;
		
		if(ventasPaises.get(nombre) == null) {
			ventasPaises.put(nombre, 1);
		} else {
			ventasPaises.replace(nombre, ventasPaises.get(nombre) + 1);
		}
	}
	
	
	// CLASS METHODS
	public static String paisMasVendedor() {
		String paisMasVendedor = "";
		for (Map.Entry<String, Integer> pais : ventasPaises.entrySet()) {
			if(paisMasVendedor == "") {
				paisMasVendedor = pais.getKey();
			} else if(pais.getValue() > ventasPaises.get(paisMasVendedor)) {
				paisMasVendedor = pais.getKey();
			}
 		}
		return paisMasVendedor;
	}
	
	// GETTERS & SETTERS
	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
}
