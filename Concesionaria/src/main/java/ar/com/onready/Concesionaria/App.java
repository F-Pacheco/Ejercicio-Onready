package ar.com.onready.Concesionaria;

import ar.com.onready.Entidades.Auto;
import ar.com.onready.Entidades.AutoElectrico;
import ar.com.onready.Entidades.Moto;
import ar.com.onready.Utilidades.Impresion;

public class App 
{
    public static void main( String[] args )
    {
    	Impresion pantalla = new Impresion();
    	
    	Auto auto = new Auto("Peugeot","206",200000f,4);
    	pantalla.addVehiculo(auto);
    	Moto moto = new Moto("Honda","Titan",60000f,"125cc");
    	pantalla.addVehiculo(moto);
    	auto = new Auto("Peugeot","208",250000f,5);
    	pantalla.addVehiculo(auto);
    	auto = new AutoElectrico("Electrico","tesla",250000f,5,"5k");
    	pantalla.addVehiculo(auto);
    	
    	moto = new Moto("Yamaha","YBR",80500.50f,"160cc");
    	pantalla.addVehiculo(moto);
    	
    	pantalla.showVehiculos();
    	pantalla.showCategory("t"); //no es case sensitive
    	pantalla.showOrdenados();
    	pantalla.showLujo();
    	
    }
}
