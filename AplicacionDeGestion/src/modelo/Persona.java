package modelo;



public class Persona {

	
	private String nombre;
	private int edad;
	private String direccion;
	
	
	
	
	public Persona() { 
		
	}

	public Persona(String nombre) {
		
		this.nombre = nombre;
	}

	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Constructor que recibe tres parametros 
	 * @param nombre
	 * @param edad
	 * @param direccion
	 */
	public Persona(String nombre, int edad, String direccion) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	public void calculo() {
		
	}
	/**
	 * 
	 * @param edad
	 * @param nombre
	 * @param direccion
	 * @return
	 */
	
	public String comprobarDireccion(String edad, String nombre, String direccion) {
		
		String devuelve=edad+" "+nombre+" "+direccion;
		
		return devuelve;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	
	
	
}
