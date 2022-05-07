package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	// CLASS VARIABLES
	private static HashMap<Pais, Integer> ventasPaises = new HashMap<Pais, Integer>(); 
	
	// INSTANCE VARIABLES
	private String nombre;
	
	// CONSTRUCTORS
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	
	// CLASS METHODS
	public static void ventaPais(Pais pais) {
		if(ventasPaises.get(pais) == null) {
			ventasPaises.put(pais, 1);
		} else {
			ventasPaises.replace(pais, ventasPaises.get(pais) + 1);
		}
	}
	
	public static Pais paisMasVendedor() {
		Pais paisMasVendedor = null;
		for (Map.Entry<Pais, Integer> pais : ventasPaises.entrySet()) {
			if(paisMasVendedor == null) {
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
