package modelo;
/**
 * 
 * @author Grupo
 *
 */

/**
 * Atributos de la clase hija Coche
 * 
 */
public class Coche extends Vehiculo {

	private byte numpuertas;
	private boolean descapotable;

	/**
	 * Constructor por defecto de la clase hija Coche
	 * 
	 */

	public Coche() {
		super();
		
	}


	/**
	 * Constructor por parámetros de la clase hija Coche
	 * @param numpuertas
	 * @param descaportable
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param combus
	 * @param cilindrada
	 * @param plazas
	 * @param ambien
	 */

	public Coche(byte numpuertas, boolean descaportable, String marca, String modelo, String color, enumTipoComb combus,
			short cilindrada, byte plazas, enumAmbiental ambien) {
		super(marca, modelo, color, combus, cilindrada, plazas, ambien);
		// TODO Auto-generated constructor stub

	}


	

	/**
	 * Get del atributo numpuertas
	 * 
	 * @return numpuertas
	 */

	public byte getNumpuertas() {
		return numpuertas;
	}

	/**
	 * Set del atributo numpuertas
	 * 
	 * @param numpuertas
	 */

	public void setNumpuertas(byte numpuertas) {
		this.numpuertas = numpuertas;
	}

	/**
	 * Get del atributo descapotable
	 * 
	 * @return descapotable
	 */

	public boolean isDescapotable() {
		return descapotable;
	}

	/**
	 * Set del atributo descapotable
	 * 
	 * @param descapotable
	 */

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

}