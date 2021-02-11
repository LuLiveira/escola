package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoRepository;
import br.com.alura.escola.dominio.aluno.CPF;

public class AlunoRepositoryJDBC implements AlunoRepository {

	@Override
	public void matricular(Aluno aluno) {
		System.out.println("CADASTRANDO ALUNO COM JDBC");
	}

	@Override
	public Aluno buscarPorCpf(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

}
