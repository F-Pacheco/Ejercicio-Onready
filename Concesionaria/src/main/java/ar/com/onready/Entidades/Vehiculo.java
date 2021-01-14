package ar.com.onready.Entidades;

public abstract class Vehiculo implements Comparable<Vehiculo> {
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	//Metodo para ordenar por precio
	//Devuelve el contrario de la operación para ordenarlo de mayor a menor
		public int compareTo(Vehiculo vehiculo) {
			if(this.precio - vehiculo.getPrecio() == 0){
				return 1;
			}else {
				return (int) -(this.precio - vehiculo.getPrecio());
			}
			
		}
		
	public Boolean isVehiculoLujo() {
		return false;
	};
	
}
