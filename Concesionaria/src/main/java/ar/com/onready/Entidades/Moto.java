package ar.com.onready.Entidades;

public class Moto extends Vehiculo{
	private String cilindrada;

	//Constructors
	public Moto() {
	}
	public Moto(String marca, String modelo, Float precio, String cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	//Getters & Setters 
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String printModelo() {
		return super.toString();
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() +  " // Cilindrada: " + this.cilindrada + " // Precio: $" + getPrecio();
	}
	
	public Boolean isVehiculoLujo() {
		if (this.cilindrada.compareTo("149cc")>=0) {
			return true;
		}
		return false;
	
	}
	
	
}
