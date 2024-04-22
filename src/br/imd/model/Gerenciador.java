package br.imd.model;

public class Gerenciador {
  private Medico[] medicos;
  private Paciente[] pacientes;
  private Consulta[] consultas;
  private int medicosCount;
  private int pacientesCount;
  private int consultasCount;

  public Gerenciador(int size) {
    medicos = new Medico[size];
    pacientes = new Paciente[size];
    consultas = new Consulta[size];
    medicosCount = 0;
    pacientesCount = 0;
    consultasCount = 0;
  }

  public boolean cadastrarMedico(String especialidade, String crm, String nome, String cpf) {
    if (medicosCount < medicos.length) {
      medicos[medicosCount] = new Medico(nome, cpf, especialidade, crm);
      medicosCount++;
      return true;
    }
    return false; // Não há espaço para cadastrar mais médicos
  }

  public boolean cadastrarPaciente(boolean convenio, String nome, String cpf, String[] enf) {
    if (pacientesCount < pacientes.length) {
      pacientes[pacientesCount] = new Paciente(nome, cpf, convenio, enf);
      pacientesCount++;
      return true;
    }
    return false; // Não há espaço para cadastrar mais pacientes
  }

  public void cadastrarConsulta(String cpfMedico, String cpfPaciente, int diaConsulta) {
    Medico medico = null;
    Paciente paciente = null;
    for (int i = 0; i < medicosCount; i++) {
      if (medicos[i].getCPF().equals(cpfMedico)) {
        medico = medicos[i];
        break;
      }
    }
    for (int i = 0; i < pacientesCount; i++) {
      if (pacientes[i].getCPF().equals(cpfPaciente)) {
        paciente = pacientes[i];
        break;
      }
    }
    if (medico != null && paciente != null) {
      if (consultasCount < consultas.length) {
        consultas[consultasCount] = new Consulta(paciente, medico, diaConsulta);
        consultasCount++;
      } else {
        System.out.println("\nNão há espaço para agendar mais consultas.");
      }
    } else {
      System.out.println("\nMédico ou paciente não encontrado.");
    }
  }

  public void listarConsultas() {
    System.out.println("\n--------------------------------------");
    System.out.println("LISTA DE CONSULTAS:");
    for (int i = 0; i < consultasCount; i++) {
      System.out.println(consultas[i]);
    }
    System.out.println("--------------------------------------");
    
  }

  public void listarMedicos() {
    System.out.println("\n--------------------------------------");
    System.out.println("LISTA DE MÉDICOS:");
    for (int i = 0; i < medicosCount; i++) {
      System.out.println(medicos[i]);
    }
   
  }

  public void listarPacientes() {
    System.out.println("\n--------------------------------------");
    System.out.println("LISTA DE PACIENTES:");
    for (int i = 0; i < pacientesCount; i++) {
      System.out.println(pacientes[i]);
    }
  
  }

  public void excluirMedico(String cpfMedico) {
    for (int i = 0; i < consultasCount; i++) {
        if (consultas[i].getMedico().getCPF().equals(cpfMedico)) {
            // Move a última consulta para a posição a ser excluída e decrementa o contador
            consultas[i] = consultas[consultasCount - 1];
            consultasCount--;
            consultas[consultasCount] = null; // Limpa a última posição
            i--; // Para revisar a posição atual após a substituição
        }
    }

    for (int i = 0; i < medicosCount; i++) {
        if (medicos[i].getCPF().equals(cpfMedico)) {
            // Move o último médico para a posição a ser excluída e decrementa o contador
            medicos[i] = medicos[medicosCount - 1];
            medicosCount--;
            medicos[medicosCount] = null; // Limpa a última posição
            System.out.println("###########################");
            System.out.println("Médico excluído com sucesso.");
            System.out.println("############################\n");
            return;
        }
    }
    System.out.println("#######################");
    System.out.println("Médico não encontrado.");
    System.out.println("#######################\n");
}

public void excluirPaciente(String cpfPaciente) {
  for (int i = 0; i < consultasCount; i++) {
      if (consultas[i].getPaciente().getCPF().equals(cpfPaciente)) {
          // Move a última consulta para a posição a ser excluída e decrementa o contador
          consultas[i] = consultas[consultasCount - 1];
          consultasCount--;
          consultas[consultasCount] = null; // Limpa a última posição
          i--; // Para revisar a posição atual após a substituição
      }
  }

  for (int i = 0; i < pacientesCount; i++) {
      if (pacientes[i].getCPF().equals(cpfPaciente)) {
          // Move o último paciente para a posição a ser excluída e decrementa o contador
          pacientes[i] = pacientes[pacientesCount - 1];
          pacientesCount--;
          pacientes[pacientesCount] = null; // Limpa a última posição
          System.out.println("#############################");
          System.out.println("Paciente excluído com sucesso.");
          System.out.println("##############################\n");
          return;
      }
  }
  System.out.println("#######################");
  System.out.println("Paciente não encontrado.");
  System.out.println("#######################");
}

  public void excluirConsulta(String cpfMedico, String cpfPaciente, int dia) {
    for (int i = 0; i < consultasCount; i++) {
      if (consultas[i].getMedico().getCPF().equals(cpfMedico) &&
          consultas[i].getPaciente().getCPF().equals(cpfPaciente) &&
          consultas[i].getDataAgendada() == dia) {
        // Move a última consulta para a posição a ser excluída e decrementa o contador
        consultas[i] = consultas[consultasCount - 1];
        consultasCount--;
        System.out.println("################################");
        System.out.println("\nConsulta excluída com sucesso.");
        System.out.println("################################");
        return;
      }
    }
    System.out.println("#######################");
    System.out.println("Consulta não encontrada.");
    System.out.println("#######################");
  }
}