package com.dio.model;

import java.util.Objects;

public class project {
	private String nome;
	private String cor;
	private Interger idade;

	public project() {
	}

	public project(String nome, String cor, Interger idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "project [nome=" + nome + ", cor=" + cor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		project other = (project) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Interger getIdade() {
		return idade;
	}

	public void setIdade(Interger idade) {
		this.idade = idade;
	}

	/*
	 * public project (String nome, String cor, Interger idade) { this.nome= nome;
	 * this.cor= cor; this.idade = idade; }
	 */

}
