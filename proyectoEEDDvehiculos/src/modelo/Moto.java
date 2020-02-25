package modelo;

/**Atributos de la clase hija Moto
 * 
 * 
 *
 */
public class Moto extends Vehiculo {
	protected enum tipoMoto {
		CUSTOM, DEPORTIVA, QUAD
	}

	private byte numRuedas;

	/**Constructor por defecto de la clase hija moto
	 * 
	 * 
	 */
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**Constructor por parámetros de la clase hija moto
	 * 
	 * @param numRuedas
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param combus
	 * @param cilindrada
	 * @param plazas
	 * @param ambien
	 */
	public Moto(byte numRuedas, String marca, String modelo, String color, tipoComb combus, short cilindrada,
			byte plazas, ambiental ambien) {
		super(marca, modelo, color, combus, cilindrada, plazas, ambien);
		// TODO Auto-generated constructor stub
	}

	/**Get del atributo numRuedas
	 * 
	 * @return numRuedas
	 */

	public byte getNumRuedas() {
		return numRuedas;
	}

	/**Set del atributo numRuedas
	 * 
	 * @param numRuedas
	 */
	public void setNumRuedas(byte numRuedas) {
		this.numRuedas = numRuedas;
	}

}
