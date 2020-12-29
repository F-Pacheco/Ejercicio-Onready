package ar.com.onready.Entidades;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private Float precio;
	
	//Constructors
	public Vehiculo() {
	}
	public Vehiculo(String marca, String modelo, Float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	//Getters & Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	public abstract String printModelo();
	
	//Methods
	@Override
	public String toString() {
		return  marca + " " + modelo;
	}
	
}
