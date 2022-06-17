package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	//LISKOV SUBSTITUTION PRINCIPLE
	private DadosPessoais dadosPessoais;
	private String empresa;

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}