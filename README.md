# Sistema de Gerenciamento de Consultas Hospitalares
Este é um sistema desenvolvido para gerenciar consultas médicas em um hospital, envolvendo médicos e pacientes. Foi implementado como parte da disciplina de Linguagem de Programação II do curso de Bacharelado em Tecnologia da Informação da Universidade Federal do Rio Grande do Norte (UFRN).

## Funcionalidades
### Classes Principais

#### Médico
- Atributos:
String nome
String CPF
String especialidade
String CRM
- Métodos:
Métodos get/set
Construtor com atributos

### Paciente
- Atributos:
String nome
String CPF
boolean convênio
String[] enfermidadesRegistradas
- Métodos:
Métodos get/set
Construtor com atributos

### Consulta
- Atributos:
Paciente paciente
Médico médico
int dataAgendada
Métodos:
Métodos get/set
Construtor com atributos

### Gerenciador
Gerenciador
- Atributos:
Medico[] medicos
Paciente[] pacientes
Consulta[] consultas
- Métodos:
Construtor que recebe o tamanho dos arrays e os inicializa
public boolean cadastrarMedico(String especialidade, String crm, String nome, String cpf)
public boolean cadastrarPaciente(boolean convenio, String nome, String cpf, String[] enf)
public void cadastrarConsulta(String cpfMedico, String cpfPaciente, int diaConsulta)
public void listarConsultas()
public void listarMedicos()
public void listarPacientes()
public void excluirMedico(String cpfMedico)
public void excluirPaciente(String cpfPaciente)
public void excluirConsulta(String cpfMedico, String cpfPaciente, int dia)

## Execução
Para executar o sistema:
- Crie uma instância da classe Main
- Utilize os métodos desta classe para interagir com o sistema, como cadastrar médicos, pacientes e consultas, listar informações e excluir registros.
