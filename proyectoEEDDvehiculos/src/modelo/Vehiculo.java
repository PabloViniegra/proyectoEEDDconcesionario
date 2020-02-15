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

	protected enum tipoComb {
		DIESEL, GASOLINA, ELECTRICO, HIBRIDO
	}

	protected tipoComb combus;
	protected short cilindrada;
	protected byte plazas;

	protected enum ambiental {
		A, B, C, ECO, ZERO
	}

	protected ambiental ambien;

	// Constructor por defecto
	public Vehiculo() {
		marca = "";
		modelo = "";
		color = "";
		cilindrada = 0;
		plazas = 0;
	}

	// Constructor con parámetros
	public Vehiculo(String marca, String modelo, String color, tipoComb combus, short cilindrada, byte plazas,
			ambiental ambien) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.combus = combus;
		this.cilindrada = cilindrada;
		this.plazas = plazas;
		this.ambien = ambien;
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
