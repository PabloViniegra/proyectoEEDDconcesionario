package modelo;

import modelo.Vehiculo.ambiental;
import modelo.Vehiculo.tipoComb;

public class Camion extends Vehiculo{
private int taramax;
private int galibo;



public Camion() {
	super();
	// TODO Auto-generated constructor stub
}
public Camion(int taramax, int galibo,String marca, String modelo, String color, tipoComb combus, short cilindrada, byte plazas,
		ambiental ambien) {
	super(marca, modelo, color, combus, cilindrada, plazas, ambien);
	// TODO Auto-generated constructor stub
}
public int getTaramax() {
	return taramax;
}
public void setTaramax(int taramax) {
	this.taramax = taramax;
}
public int getGalibo() {
	return galibo;
}
public void setGalibo(int galibo) {
	this.galibo = galibo;
}
 public String velocidad(){
	
	 String velocidad="";
	 return velocidad;
 }



}