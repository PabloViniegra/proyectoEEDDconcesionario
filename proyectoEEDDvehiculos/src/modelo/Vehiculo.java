package modelo;

/**
 * 
 * @author grupo La clase Vehiculo es la clase padre de la que heredan el resto.
 *         Tiene su método CalculaITV el cual pueden implementar las clases
 *         hijas.
 *
 */
public class Vehiculo {

	/*
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


	// Constructor por defecto
	public Vehiculo() {
		marca = "";
		modelo = "";
		color = "";
		cilindrada = 0;
		plazas = 0;
	}

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public short getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(short cilindrada) {
		this.cilindrada = cilindrada;
	}

	public byte getPlazas() {
		return plazas;
	}

	public void setPlazas(byte plazas) {
		this.plazas = plazas;
	}

}
