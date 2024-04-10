package br.imd.model;

public class Gerenciador {
  private Medico[] medicos = new Medico[10];
  private Paciente[] pacientes = new Paciente[10];
  private Consulta[] consultas = new Consulta[100];

  //methods
  public boolean cadastrarConsulta(Paciente paciente, Medico medico, int dataAgendada) {
    for (int i = 0; i < consultas.length; i++) {
      if (consultas[i] == null) {
        consultas[i] = new Consulta(paciente, medico, dataAgendada);
        break;
      }
    }
    return false;
  }

  public void excluirConsulta(Consulta consulta) {
    for (int i = 0; i < consultas.length; i++) {
      if (consultas[i] == consulta) {
        consultas[i] = null;
        break;
      }
    }
  }

  public void listarConsultasPorMedico(Medico medico) {
    for (int i = 0; i < consultas.length; i++) {
      if (consultas[i] != null && consultas[i].getMedico() == medico) {
        System.out.println(consultas[i].getPaciente().getNome());
      }
    }
  }

  public void listarConsultasTodas() {
    for (int i = 0; i < consultas.length; i++) {
      if (consultas[i] != null) {
        System.out.println(consultas[i].getPaciente().getNome());
      }
    }
  }

  public void addMedico(Medico medico) {
    for (int i = 0; i < medicos.length; i++) {
      if (medicos[i] == null) {
        medicos[i] = medico;
        break;
      }
    }
  }

  public void addPaciente(Paciente paciente) {
    for (int i = 0; i < pacientes.length; i++) {
      if (pacientes[i] == null) {
        pacientes[i] = paciente;
        break;
      }
    }
  }
}
