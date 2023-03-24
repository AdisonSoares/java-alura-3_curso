package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Aluno {
	
	private Cpf cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	
	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	public String getCpf() {
		return cpf.toString();
	}
	
	public String getEmail() {
		return email.toString();
	}

}