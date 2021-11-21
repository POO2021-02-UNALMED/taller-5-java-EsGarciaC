package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
		
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		Animal caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return caballo;
	}
	
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Animal leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return leon;
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
