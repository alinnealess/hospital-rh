package br.imd.model;

import java.util.Vector;

public class Medico extends Pessoa{
  protected String especialidade;
  protected String CRM;
  private Paciente[] pacientesAtendidos = new Paciente[10];
  private boolean[] consultasAgendadas = new boolean[30];

  public Medico(String nome, String cPF, String especialidade, String cRM, Paciente[] pacientesAtendidos,
      boolean[] consultasAgendadas) {
    super(nome, cPF);
    this.especialidade = especialidade;
    this.CRM = cRM;
    this.pacientesAtendidos = pacientesAtendidos;
    this.consultasAgendadas = consultasAgendadas;
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

  public Paciente[] getPacientesAtendidos() {
    return pacientesAtendidos;
  }

  public void setPacientesAtendidos(Paciente[] pacientesAtendidos) {
    this.pacientesAtendidos = pacientesAtendidos;
  }

  public boolean[] getConsultasAgendadas() {
    return consultasAgendadas;
  }

  public void setConsultasAgendadas(boolean[] consultasAgendadas) {
    this.consultasAgendadas = consultasAgendadas;
  }

  
  

}
