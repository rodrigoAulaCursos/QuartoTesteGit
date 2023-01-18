package com.exemplo.git.model;

public class Pessoa {
	
	private String nomePessoa;
	private String email;
	private String cpf;
	private Date dtNascimento;
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getdtNascimento() {
		return dtNascimento;
	}
	public void setdtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
