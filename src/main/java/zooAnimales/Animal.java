package zooAnimales;

import gestion.*;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public String movimiento() {
		
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		
		return "Mamiferos: " + Mamifero.cantidadMamiferos() +  "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		if(zona != null) {
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo().getNombre();
		}
		else {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
		}
	}	

	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public static void main(String Args[]) {
		Animal a1 = new Anfibio();
		Animal a2 = new Ave();
		Animal a3 = new Mamifero();
		Animal a4 = new Pez();
		Animal a5 = new Reptil();
		System.out.println(a1.movimiento());
		System.out.println(a2.movimiento());
		System.out.println(a3.movimiento());
		System.out.println(a4.movimiento());
		System.out.println(a5.movimiento());
	}
}
