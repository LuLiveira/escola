package br.com.alura.escola.dominio.aluno;

public class FabricaDeAluno {

	private Aluno aluno;

	public FabricaDeAluno comNomeCpfEEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(nome, new CPF(cpf), new Email(email));
		return this;
	}

	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno build() {
		return this.aluno;
	}
}
