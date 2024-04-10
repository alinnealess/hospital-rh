package br.imd.model;

public class Pessoa {
  protected String nome;
  protected String CPF;

  public Pessoa(String nome, String cPF) {
    this.nome = nome;
    this.CPF = cPF;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cPF) {
    this.CPF = cPF;
  }

  
}
