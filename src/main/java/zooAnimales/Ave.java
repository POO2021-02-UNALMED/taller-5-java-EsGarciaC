package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado =  new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
		
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		
	}

	public static int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		
		return "volar";
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		Animal halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	
	public static Animal crearAguila(String nombre, int edad, String genero) {
		Animal aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return aguila;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	
}
