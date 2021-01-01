package ar.com.onready.Utilidades;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import ar.com.onready.Entidades.Vehiculo;

public class Impresion {
	
	private Set<Vehiculo> vehiculos;
	
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
	
	
	public Set<Vehiculo> find(String c, Set<Vehiculo> vehiculos){
		Set<Vehiculo> coincidentes= new HashSet<>();
		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getModelo().contains(c)) {
				coincidentes.add(vehiculo);
			}
		}
		return coincidentes;
	} 
	
	public void showCategory(){
		TreeSet<Vehiculo> ordenados = new TreeSet<>(vehiculos);
		System.out.println("Vehiculo mas caro: "+ordenados.last().printModelo());
		System.out.println("Vehiculo mas barato: "+ordenados.first().printModelo());
		
		System.out.print("Vehiculos que contienen en el modelo la letra Y: ");		
		for (Vehiculo vehiculo : find("Y",vehiculos)) {
			System.out.println(vehiculo.printModelo()+" $"+vehiculo.getPrecio());
		}
		
		System.out.println("=============================");
		showOrdenados(ordenados);
	}
	
	public void showOrdenados(TreeSet<Vehiculo> ordenados) {
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		Set<Vehiculo> aux =  ordenados.descendingSet();
		for (Vehiculo vehiculo : aux) {
			System.out.println(vehiculo.printModelo());
		}
		
		
	}
	
}
