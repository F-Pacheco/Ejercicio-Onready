package ar.com.onready.Utilidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.com.onready.Entidades.Vehiculo;

public class Impresion {
	private List <Vehiculo> vehiculos;
	
	//Constructor
	public Impresion() {
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	//Methods
	public void addVehiculo(Vehiculo movil) {
		vehiculos.add(movil);
	}
	
	public void showVehiculos() {
		for (int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i));
		}
		System.out.println("=============================");
	}
	
	public List<Vehiculo> find(String c, List <Vehiculo> coincidentes){
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getModelo().contains(c)) {
				coincidentes.add(vehiculos.get(i));
			};
		}
		return coincidentes;
	}
	
	public void showCategory(){
		List <Vehiculo> coincidentes = new ArrayList<Vehiculo>();
		
		vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
		System.out.println("Vehiculo mas caro: "+vehiculos.get(0).printModelo());
		System.out.println("Vehiculo mas barato: "+vehiculos.get(vehiculos.size()-1).printModelo());
		
		find("Y",coincidentes);
		System.out.print("Vehiculos que contienen en el modelo la letra Y: ");
		for (int i = 0; i < coincidentes.size(); i++) {
			System.out.println(coincidentes.get(i).printModelo() +" $"+ coincidentes.get(i).getPrecio());
		}
		System.out.println("=============================");
	}
	
	public void showOrdenados() {
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		for (int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i).printModelo());
		}
	}
	
	
	
}
