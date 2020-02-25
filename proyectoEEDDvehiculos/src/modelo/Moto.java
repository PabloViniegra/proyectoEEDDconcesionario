package modelo;

/**Atributos de la clase hija Moto
 * 
 * 
 *
 */
public class Moto extends Vehiculo {
<<<<<<< HEAD
	protected enum tipoMoto {
		CUSTOM, DEPORTIVA, QUAD
	}

	private byte numRuedas;
=======
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
>>>>>>> c655e8e453dcf93920008b4eeac9427a8d0777ef

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
