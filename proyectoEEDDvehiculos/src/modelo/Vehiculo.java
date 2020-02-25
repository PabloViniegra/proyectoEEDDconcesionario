package modelo;

/**
 * 
 * @author grupo La clase Vehiculo es la clase padre de la que heredan el resto.
 *         Tiene su método CalculaITV el cual pueden implementar las clases
 *         hijas.
 *
 */
public class Vehiculo {

	/**
	 * Atributos de la clase Vehiculo. LLevan protected para que las clases hijas
	 * puedan acceder también
	 */
	protected String marca;
	protected String modelo;
	protected String color;
	protected enumTipoComb tipoComb;
	protected short cilindrada;
	protected byte plazas;
	protected enumAmbiental ambiental;


	protected enum ambiental {
		A, B, C, ECO, ZERO
	}

	protected ambiental ambien;
	
	/**Constructor por defecto de la clase padre Vehiculo
	 * 
	 */

	// Constructor por defecto
	public Vehiculo() {
		marca = "";
		modelo = "";
		color = "";
		cilindrada = 0;
		plazas = 0;
	}
	/**Constructor por parámetros de la clase padre Vehiculo
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param combus
	 * @param cilindrada
	 * @param plazas
	 * @param ambien
	 */

	// Constructor con parámetros
	public Vehiculo(String marca, String modelo, String color, enumTipoComb tipoComb, short cilindrada, byte plazas,
			enumAmbiental ambiental) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoComb = tipoComb;
		this.cilindrada = cilindrada;
		this.plazas = plazas;
		this.ambiental = ambiental;
	}
	/**Get del atributo marca
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}
	/**Set del atributo marca
	 * 
	 *  @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**Get del atributo modelo
	 * 
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**Set del atributo modelo
	 * 
	 *  @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**Get del atributo color
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	/**Set del atributo color
	 * 
	 *  @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**Get del atributo cilindrada
	 * 
	 * @return cilindrada
	 */
	public short getCilindrada() {
		return cilindrada;
	}
	/**Set del atributo cilindrada
	 * 
	 *  @param cilindrada
	 */
	public void setCilindrada(short cilindrada) {
		this.cilindrada = cilindrada;
	}
	/**Get del atributo plazas
	 * 
	 * @return plazas
	 */
	public byte getPlazas() {
		return plazas;
	}
	
	/**Set del atributo plazas
	 * 
	 *  @param plazas
	 */
	public void setPlazas(byte plazas) {
		this.plazas = plazas;
	}

}
