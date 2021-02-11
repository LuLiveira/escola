package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.aplicacao.indicacao.EnviarEmail;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicado implements EnviarEmail {

	@Override
	public void enviar(Aluno aluno) {
		System.out.println("ENVIANDO EMAIL PARA O ALUNO INDICADO");
	}

}
