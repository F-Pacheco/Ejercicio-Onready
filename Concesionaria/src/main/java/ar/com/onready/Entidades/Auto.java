package ar.com.onready.Entidades;

public class Auto extends Vehiculo{
	private Integer puertas;

	//Constructors
	public Auto() {
	}
	public Auto(String marca, String modelo, Float precio, Integer puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	
	//Getters & Setters
	public Integer getPuertas() {
		return puertas;
	}
	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	
	public String printModelo() {
		return super.toString();
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() +  " // Puertas: " + this.puertas + " // Precio: $" + getPrecio();
	}
	
	
	
	
	
	
	
}
