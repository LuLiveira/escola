package br.com.alura.escola.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.aluno.Aluno;

public class Indicacao {

	private Aluno indicador;
	private Aluno indicante;
	private LocalDateTime data;

	public Indicacao(Aluno indicador, Aluno indicante) {
		this.indicador = indicador;
		this.indicante = indicante;
		this.data = LocalDateTime.now();
	}

	public Aluno getIndicador() {
		return indicador;
	}

	public void setIndicador(Aluno indicador) {
		this.indicador = indicador;
	}

	public Aluno getIndicante() {
		return indicante;
	}

	public void setIndicante(Aluno indicante) {
		this.indicante = indicante;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
