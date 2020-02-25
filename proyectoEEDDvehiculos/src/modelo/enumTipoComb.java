package modelo;

public enum enumTipoComb {
	GASOLINA,DIESEL,ELECTRICO,HIBRIDO;
	
	public static enumTipoComb getGASOLINA() {
        return GASOLINA;
    }

    public static enumTipoComb getDIESEL() {
        return DIESEL;
    }

    public static enumTipoComb getELECTRICO() {
        return ELECTRICO;
    }

    public static enumTipoComb getHIBRIDO() {
        return HIBRIDO;
    }
}
