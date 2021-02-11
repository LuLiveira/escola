package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.FabricaDeAluno;
import br.com.alura.escola.infra.aluno.AlunoRepositoryMemoria;

public class Principal {

	public static void main(String[] args) {

		String nome = "Lucas Oliveira";
		String cpf = "";
		String email = "lcsd.lucas@gmail.com";
		String ddd = "13";
		String telefone = "982237209";


		AlunoRepositoryMemoria repository = new AlunoRepositoryMemoria();
		Aluno aluno = null;
		
		for(int i = 0; i <= 10000000; i++) {
			cpf = String.valueOf(i);
			aluno = new FabricaDeAluno().comNomeCpfEEmail(nome, cpf, email).comTelefone(ddd, telefone).build();
			repository.matricular(aluno);
		}
		
		repository.buscarPorCpf(new CPF("1"));
		repository.buscarPorCpf2(new CPF("1"));
	}
}
