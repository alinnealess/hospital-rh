package br.imd.main;

import br.imd.model.Gerenciador;

public class Main {
    public static void main(String[] args) {
    Gerenciador gerenciador = new Gerenciador(5);

    // Cadastrando médicos
    gerenciador.cadastrarMedico("Cardiologia", "1234", "João Paulo", "123.456.789-00");
    gerenciador.cadastrarMedico("Pediatria", "5678", "Maria Borges", "234.567.890-11");
    gerenciador.cadastrarMedico("Ortopedia", "9012", "Felipe Henrique", "345.678.901-22");
    gerenciador.cadastrarMedico("Neurologia", "9025", "Pedro Lucas", "379.777.830-96");
    gerenciador.cadastrarMedico("Nefrologia", "1012", "Gabriel Henrique", "724.572.550-07");

    // Cadastrando pacientes
    gerenciador.cadastrarPaciente(true, "Ana Paula", "987.654.321-00", new String[]{"Dor no peito", "Febre"});
    gerenciador.cadastrarPaciente(false, "José Feitosa", "876.543.210-11", new String[]{"Febre", "Dor nas Costas"});
    gerenciador.cadastrarPaciente(false, "Maria Mercedes", "985.972.250-17", new String[]{"Gripe", "Febre"});
    gerenciador.cadastrarPaciente(true, "Osvaldo RAfael", "379.777.830-96", new String[]{"Dor de cabeça", "Febre"});
    gerenciador.cadastrarPaciente(true, "Marilia Gabriela", "885.972.250-17", new String[]{"Gripe", "Febre"});

    // Cadastrando consultas
    gerenciador.cadastrarConsulta("123.456.789-00", "987.654.321-00", 20240423);
    gerenciador.cadastrarConsulta("234.567.890-11", "876.543.210-11", 20240425);
    gerenciador.cadastrarConsulta("345.678.901-22", "985.972.250-17", 20240427);
    gerenciador.cadastrarConsulta("379.777.830-96", "379.777.830-96", 20240429);
    gerenciador.cadastrarConsulta("724.572.550-07", "885.972.250-17", 20240501);

    // Listando médicos, pacientes e consultas
    gerenciador.listarMedicos();
    gerenciador.listarPacientes();
    gerenciador.listarConsultas();

    // Excluindo um médico e um paciente
    gerenciador.excluirMedico("724.572.550-07");
    gerenciador.excluirPaciente("885.972.250-17");

    // Listando médicos, pacientes e consultas após exclusões
    gerenciador.listarMedicos();
    gerenciador.listarPacientes();
    gerenciador.listarConsultas();
}

}


