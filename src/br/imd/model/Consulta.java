package br.imd.model;

public class Consulta {
  private Paciente paciente;
  private Medico medico;
  private int dataAgendada;

  public Consulta(Paciente paciente, Medico medico, int dataAgendada) {
    this.paciente = paciente;
    this.medico = medico;
    this.dataAgendada = dataAgendada;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public int getDataAgendada() {
    return dataAgendada;
  }

  public void setDataAgendada(int dataAgendada) {
    this.dataAgendada = dataAgendada;
  }

  @Override
  public String toString() {
    return paciente + "; \n" + medico + "; \nData Agendada:" + dataAgendada + "\n";
  }


// public String toString() {
//   return "Consulta agendada para o dia " + dataAgendada + " com o médico " + medico.getNome() + " e o paciente " + paciente.getNome();
// }


}
