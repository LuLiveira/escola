package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Criptografia;

public class CriptografarSenhaComBcrypt implements Criptografia {

	@Override
	public String criptografar(String s) {
		System.out.println("CRIPTOGRAFANDO COM BCRYPT");
		return "";
	}

	@Override
	public String descriptografar(String s) {
		System.out.println("DESCRIPTOGRAFANDO COM BCRYPT");
		return "";
	}

}
