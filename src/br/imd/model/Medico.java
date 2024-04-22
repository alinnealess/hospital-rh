package br.imd.model;


public class Medico extends Pessoa{
  protected String especialidade;
  protected String CRM;
  //private Paciente[] pacientesAtendidos = new Paciente[10];
  //private boolean[] consultasAgendadas = new boolean[30];

  public Medico(String nome, String cPF, String especialidade, String cRM) {
    super(nome, cPF);
    this.especialidade = especialidade;
    CRM = cRM;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public String getCRM() {
    return CRM;
  }

  public void setCRM(String cRM) {
    CRM = cRM;
  }

  public String toString() {
    return "Médico: " + nome + ", CRM: " + CRM + ", Especialidade: " + especialidade;
}


}
