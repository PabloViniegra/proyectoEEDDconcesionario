package modelo;

/**Atributos de la clase hija Moto
 * 
 * 
 *
 */
public class Moto extends Vehiculo {

	

	private byte numRuedas;
	protected enumTipoMoto tipoMoto;
	

	/**Constructor por defecto de la clase hija moto
	 * 
	 * 
	 */
	public Moto() {
		super();
		
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
	public Moto(byte numRuedas, String marca, String modelo, String color, enumTipoComb combus, short cilindrada,
			byte plazas, enumAmbiental ambien) {
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
