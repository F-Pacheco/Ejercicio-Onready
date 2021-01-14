package ar.com.onready.Entidades;

public class AutoElectrico extends Auto {
	private String voltaje;

	public AutoElectrico(String marca, String modelo, Float precio, Integer puertas,String voltaje) {
		super(marca, modelo,  precio,  puertas);
		this.voltaje = voltaje;
	}

	public String getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}

	@Override
	public String toString() {
		return  super.toString() + ", voltaje: " + voltaje;
	}
	
	
	public Boolean isVehiculoLujo() {
		return true;
	}
}
