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




	public Coche( byte numpuertas, boolean descaportable,String marca, String modelo, String color, enumTipoComb tipoComb, short cilindrada, byte plazas,
			enumAmbiental ambiental) {
		super(marca, modelo, color, tipoComb, cilindrada, plazas, ambiental);
		
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