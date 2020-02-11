package modelo;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String color;

	protected enum tipoComb {
		DIESEL, GASOLINA, ELECTRICO, HIBRIDO
	}

	protected short cilindrada;
	protected byte plazas;

	protected enum ambiental {
		A, B, C, ECO, ZERO
	}

	public Vehiculo() {
		marca = "";
		modelo = "";
		color = "";
		cilindrada = 0;
		plazas = 0;
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
