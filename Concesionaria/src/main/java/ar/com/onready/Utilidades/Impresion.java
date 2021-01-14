package ar.com.onready.Utilidades;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import ar.com.onready.Entidades.Vehiculo;

public class Impresion {
	
	private Set<Vehiculo> vehiculos;
	private TreeSet<Vehiculo> ordenados;
	
	//Constructor
	public Impresion() {
		vehiculos = new LinkedHashSet<Vehiculo>();
	}
	
	//Methods
	public void addVehiculo(Vehiculo movil) {
		vehiculos.add(movil);
	}
	
	public void showVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
		System.out.println("=============================");
	}
	
	
	//Paso los String a upperCase para buscar coincidencias 
	public Set<Vehiculo> find(String c, Set<Vehiculo> vehiculos){
		Set<Vehiculo> coincidentes= new HashSet<>();
		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getModelo().toUpperCase().contains(c.toUpperCase())) {
				coincidentes.add(vehiculo);
			}
		}
		return coincidentes;
	} 
	
	public void showCategory(String c){
		ordenados = new TreeSet<>(vehiculos);
		System.out.println("Vehiculo mas caro: "+ordenados.first().printModelo());
		System.out.println("Vehiculo mas barato: "+ordenados.last().printModelo());
		
		System.out.print("Vehiculos que contienen en el modelo la letra "+c+": ");		
		
		for (Vehiculo vehiculo : find(c,vehiculos)) {
			System.out.println(vehiculo.printModelo()+" $"+vehiculo.getPrecio());
		}
		System.out.println("=============================");
	}
	
	public void showOrdenados() {
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		
		for (Vehiculo vehiculo : ordenados) {
			System.out.println(vehiculo.printModelo());
		}
		
	}
	
	public void showLujo() {
		System.out.println("=============================");

		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo.isVehiculoLujo()) {
				System.out.println(vehiculo);
			}
		}	
	}
	
}
