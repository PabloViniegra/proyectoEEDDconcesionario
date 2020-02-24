package modelo;

public class Moto extends Vehiculo {
 protected enum tipoMoto{
	 CUSTOM,DEPORTIVA,QUAD
 }
 private byte numRuedas;

 
 
 
 
 public Moto() {
	super();
	// TODO Auto-generated constructor stub
}
public Moto(byte numRuedas,String marca, String modelo, String color, tipoComb combus, short cilindrada, byte plazas,
		ambiental ambien) {
	super(marca, modelo, color, combus, cilindrada, plazas, ambien);
	// TODO Auto-generated constructor stub
}
public byte getNumRuedas() {
	return numRuedas;
}
public void setNumRuedas(byte numRuedas) {
	this.numRuedas = numRuedas;
}
 
 
 
 
 
 
 
}

