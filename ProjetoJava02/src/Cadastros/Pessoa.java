package Cadastros;

import java.sql.Date;

import javax.xml.crypto.Data;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String email;
	private String endereco;
	private Date data;
	private String CPF;
	private String Teste;
	
	//Esse ? um comentario no sistema
	public String getTeste() {
		return Teste;
	}

	public void setTeste(String teste) {
		Teste = teste;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	private String dataNascimento;
}


