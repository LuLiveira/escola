package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoRepository;

public class AlunoRepositoryJDBC implements AlunoRepository {

	@Override
	public void matricular(Aluno aluno) {
		System.out.println("CADASTRANDO ALUNO COM JDBC");
	}

}
