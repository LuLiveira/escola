package br.com.alura.escola.dominio.aluno;

public interface AlunoRepository {

	void matricular(Aluno aluno);
	
	Aluno buscarPorCpf(CPF cpf);
}
