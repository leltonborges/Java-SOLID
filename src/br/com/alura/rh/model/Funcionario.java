package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
		this.dadosPessoais = dadosPessoais;
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste) {
		this(new DadosPessoais(nome, cpf, cargo, salario), dataUltimoReajuste);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
    }

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}
}
