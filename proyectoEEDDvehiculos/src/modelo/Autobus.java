package modelo;

public class Autobus extends Vehiculo {
private boolean acceso;
private boolean articulacion;
private boolean rutina;




public Autobus() {
	super();
	
}




public Autobus(boolean acceso, boolean articulacion, boolean rutina, String marca, String modelo, String color, tipoComb combus, short cilindrada, byte plazas,
		ambiental ambien) {
	super(marca, modelo, color, combus, cilindrada, plazas, ambien);
	
}




public boolean isAcceso() {
	return acceso;
}




public void setAcceso(boolean acceso) {
	this.acceso = acceso;
}




public boolean isArticulacion() {
	return articulacion;
}




public void setArticulacion(boolean articulacion) {
	this.articulacion = articulacion;
}




public boolean isRutina() {
	return rutina;
}




public void setRutina(boolean rutina) {
	this.rutina = rutina;
}




public int numRuta() {
	
	int ruta=0;
	return ruta;
}
}
