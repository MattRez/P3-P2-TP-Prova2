package br.edu.univas.vo;

import br.edu.univas.database.TipoSanguineo;

public class Doador {
	
	private Long cpf;
	private TipoSanguineo tipoSanguineo;
	
	public Doador() { }
	
	public Doador(Long cpf, String tipoSanguineo) {
		this.cpf = cpf;
		//this.tipoSanguineo = tipoSanguineo;
	}
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
}
