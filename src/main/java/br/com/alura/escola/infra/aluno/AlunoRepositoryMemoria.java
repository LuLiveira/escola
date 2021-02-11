package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoRepository;
import br.com.alura.escola.dominio.aluno.CPF;

public class AlunoRepositoryMemoria implements AlunoRepository {

	private static List<Aluno> alunos = new ArrayList<Aluno>();

	@Override
	public void matricular(Aluno aluno) {
		alunos.add(aluno);
//		System.out.println("ALUNO MATRICULADO COM SUCESSO");
//		System.out.println(alunos.size());
	}

	@Override
	public Aluno buscarPorCpf(CPF cpf) {
		long inicio = 0;
		long fim = 0;
		
		inicio = System.currentTimeMillis();
		
		Aluno aluno = alunos.stream().filter(a -> a.getCpf().getNumero().equals(cpf.getNumero())).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado."));
		
		fim = System.currentTimeMillis();
		System.out.println("Total filter: " + (fim - inicio));
		
		return aluno;
	}

	public Aluno buscarPorCpf2(CPF cpf) {
		long inicio = 0;
		long fim = 0;
		Aluno aluno2 = null;
		
		inicio = System.currentTimeMillis();
		
		for (Aluno aluno : alunos) {
			if(aluno.getCpf().getNumero().equals(cpf.getNumero())) {
				aluno2 = aluno;
			}
		}
		
		fim = System.currentTimeMillis();
		
		System.out.println("Total foreach: " + (fim - inicio));
		
		return aluno2;

	}

}
