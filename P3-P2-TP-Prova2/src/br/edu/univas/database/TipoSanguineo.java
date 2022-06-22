package br.edu.univas.database;

public enum TipoSanguineo {
	
	//TODO
	
	APOSITIVO,
	ANEGATIVO,
	BPOSITIVO,
	BNEGATIVO,
	ABPOSITIVO,
	ABNEGATIVO,
	OPOSITIVO,
	ONEGATIVO;
	
	private String tipo;
	
	TipoSanguineo() { }
	
	TipoSanguineo(String tipo) {
		this.tipo = tipo;
	}
	
	public TipoSanguineo fromTipo(String tipo) {
		//TODO
		return null;
	}
	
	public String getTipo() {
		return tipo;
	}
}
