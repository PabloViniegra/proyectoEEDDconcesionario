package modelo;




public class Camion extends Vehiculo{
private int taramax;
private int galibo;


/**
 * La clase cami�n crea objetos de tipo cami�n con atributos propios m�s los de la clase padre Veh�culo.
 */
public Camion() {
	super();
	
}
public Camion(int taramax, int galibo,String marca, String modelo, String color, enumTipoComb combus, short cilindrada, byte plazas,
		enumAmbiental ambien) {
	super(marca, modelo, color, combus, cilindrada, plazas, ambien);
	
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
 



}