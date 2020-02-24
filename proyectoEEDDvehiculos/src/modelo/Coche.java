package modelo;
/**
 * 
 * @author Grupo
 *
 */
public class Coche extends Vehiculo {
	
	private byte numpuertas;
	private boolean descapotable;
	

	
	


public Coche() {
		super();
		
	}




	public Coche( byte numpuertas, boolean descaportable,String marca, String modelo, String color, tipoComb combus, short cilindrada, byte plazas,
			ambiental ambien) {
		super(marca, modelo, color, combus, cilindrada, plazas, ambien);
		
	}




public byte getNumpuertas() {
		return numpuertas;
	}




	public void setNumpuertas(byte numpuertas) {
		this.numpuertas = numpuertas;
	}




	public boolean isDescapotable() {
		return descapotable;
	}




	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}




public int calculaKm() {
	
	int kilometraje=0;
	return kilometraje;
	
}
}