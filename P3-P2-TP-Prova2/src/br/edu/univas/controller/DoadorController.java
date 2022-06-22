package br.edu.univas.controller;

import br.edu.univas.database.Database;
import br.edu.univas.database.TipoSanguineo;
import br.edu.univas.exception.TipoSanguineoNotFoundException;
import br.edu.univas.vo.Doador;

public class DoadorController {
	
	public void cadastrarDoador(Long cpf, String tipoSanguineo) {
		if(isBloodTypeValid(tipoSanguineo)) {
			//TODO
			Database.addDoador(new Doador(cpf, tipoSanguineo));
		} else {
			throw new TipoSanguineoNotFoundException();
		}
	}
	
	public void cadastrarDoacao(String tipoSanguineo, Long quantidade) {
		if(isBloodTypeValid(tipoSanguineo)) {
			if(quantidade > 0) {
				Database.addDoacao(tipoSanguineo, quantidade);
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			throw new TipoSanguineoNotFoundException();
		}
	}
	
	private boolean isBloodTypeValid(String tipoSanguineo) {
		if(TipoSanguineo.valueOf(tipoSanguineo) != null) {
			return true;
		}
		return false;
	}
}
