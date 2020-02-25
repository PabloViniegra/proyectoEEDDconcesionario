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
		
	}

	/**
	 * Constructor por parámetros de la clase hija Autobús
	 * 
	 */

	public Autobus(boolean acceso, boolean articulacion, boolean rutina, String marca, String modelo, String color,
			enumTipoComb combus, short cilindrada, byte plazas, enumAmbiental ambien) {
		super(marca, modelo, color, combus, cilindrada, plazas, ambien);
		
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

}


