package br.imd.main;

import br.imd.model.Gerenciador;
import br.imd.model.Medico;
import br.imd.model.Paciente;

public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        // Criação e adição de médicos
        Medico medico1 = new Medico("Dr. José", "123.456.789-00", "Cardiologia", "CRM1234", null, null);
        Medico medico2 = new Medico("Dr. Ana", "234.567.890-11", "Pediatria", "CRM2345", null, null);
        Medico medico3 = new Medico("Dr. Lucas", "345.678.901-22", "Neurologia", "CRM3456", null, null);
        Medico medico4 = new Medico("Dra. Camila", "456.789.012-33", "Dermatologia", "CRM4567", null, null);
        Medico medico5 = new Medico("Dr. Marco", "567.890.123-44", "Ortopedia", "CRM5678", null, null);

        gerenciador.addMedico(medico1);
        gerenciador.addMedico(medico2);
        gerenciador.addMedico(medico3);
        gerenciador.addMedico(medico4);
        gerenciador.addMedico(medico5);

        // Criação e adição de pacientes
        Paciente paciente1 = new Paciente("Maria Silva", "987.654.321-00", true);
        Paciente paciente2 = new Paciente("João Pereira", "876.543.210-11", false);
        Paciente paciente3 = new Paciente("Ana Costa", "765.432.109-22", true);
        Paciente paciente4 = new Paciente("Luiz Santos", "654.321.098-33", true);
        Paciente paciente5 = new Paciente("Camila Gomes", "543.210.987-44", false);

        gerenciador.addPaciente(paciente1);
        gerenciador.addPaciente(paciente2);
        gerenciador.addPaciente(paciente3);
        gerenciador.addPaciente(paciente4);
        gerenciador.addPaciente(paciente5);

        // Cadastro de consultas
        gerenciador.cadastrarConsulta(paciente1, medico1, 1);
        gerenciador.cadastrarConsulta(paciente2, medico2, 3);
        gerenciador.cadastrarConsulta(paciente3, medico3, 5);
        gerenciador.cadastrarConsulta(paciente4, medico4, 7);
        gerenciador.cadastrarConsulta(paciente5, medico5, 9);

        // Listar todas as consultas
        System.out.println("Todas as consultas:");
        gerenciador.listarConsultasTodas();

        // Listar consultas de um médico específico
        System.out.println("\nConsultas do Dr. José:");
        gerenciador.listarConsultasPorMedico(medico1);
    }
}
