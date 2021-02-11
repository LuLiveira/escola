package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoRepository;
import br.com.alura.escola.dominio.aluno.FabricaDeAluno;
import br.com.alura.escola.infra.aluno.AlunoRepositoryMemoria;

public class Principal {

	public static void main(String[] args) {
		String nome = "Lucas Oliveira";
		String cpf = "363.652.858-09";
		String email= "lcsd.lucas@gmail.com";
		String ddd = "13";
		String telefone = "982237209";
		
		Aluno aluno = new FabricaDeAluno()
									.comNomeCpfEEmail(nome, cpf, email)
									.comTelefone(ddd, telefone)
									.build();
		
		AlunoRepository repository = new AlunoRepositoryMemoria();
		repository.matricular(aluno);
		
	}
}
