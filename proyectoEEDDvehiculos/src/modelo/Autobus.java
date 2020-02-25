package modelo;

public class Autobus extends Vehiculo {
	private boolean acceso;
	private boolean articulacion;
	private boolean rutina;

	/**
	 * Constructor por defecto de la clase hija Autobús
	 * 
	 */
	public Autobus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor por parámetros de la clase hija Autobús
	 * 
	 */

	public Autobus(boolean acceso, boolean articulacion, boolean rutina, String marca, String modelo, String color,
			tipoComb combus, short cilindrada, byte plazas, ambiental ambien) {
		super(marca, modelo, color, combus, cilindrada, plazas, ambien);
		// TODO Auto-generated constructor stub
	}

	/**
	 * get del atributo acceso
	 * 
	 * @return acceso
	 */

	public boolean isAcceso() {
		return acceso;
	}

	/**
	 * set del atributo acceso
	 * 
	 * @param acceso
	 */

	public void setAcceso(boolean acceso) {
		this.acceso = acceso;
	}

	/**
	 * get del atributo articulación
	 * 
	 * @return articulacion
	 */

	public boolean isArticulacion() {
		return articulacion;
	}

	/**
	 * set del atributo articulación
	 * 
	 * @param articulacion
	 */

	public void setArticulacion(boolean articulacion) {
		this.articulacion = articulacion;
	}

	/**
	 * get del atributo rutina
	 * 
	 * @return rutina
	 */

	public boolean isRutina() {
		return rutina;
	}

	/**
	 * set del atributo rutina
	 * 
	 * @param rutina
	 */

	public void setRutina(boolean rutina) {
		this.rutina = rutina;
	}

<<<<<<< HEAD
=======



public Autobus() {
	super();
	
}




public Autobus(boolean acceso, boolean articulacion, boolean rutina, String marca, String modelo, String color, enumTipoComb tipoComb, short cilindrada, byte plazas,
		enumAmbiental ambiental) {
	super(marca, modelo, color, tipoComb, cilindrada, plazas, ambiental);
	
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
>>>>>>> c655e8e453dcf93920008b4eeac9427a8d0777ef
}
