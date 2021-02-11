package br.com.alura.escola.dominio.aluno;

public class CPF {

	private String numero;

	public CPF(String numero) {
		if (numero == null) {
			throw new IllegalArgumentException("CPF inválido");
		}
		this.setNumero(numero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
