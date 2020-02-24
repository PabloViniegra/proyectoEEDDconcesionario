package modelo;

public class Moto extends Vehiculo {
 protected enumTipoMoto tipoMoto;
 private byte numRuedas;

 
 public Moto() {
	super();
	
}
public Moto(byte numRuedas,String marca, String modelo, String color, enumTipoComb tipoComb, short cilindrada, byte plazas,
		enumAmbiental ambiental) {
	super(marca, modelo, color, tipoComb, cilindrada, plazas, ambiental);
	
}
public byte getNumRuedas() {
	return numRuedas;
}
public void setNumRuedas(byte numRuedas) {
	this.numRuedas = numRuedas;
}
 
 
 
 
 
 
 
}

