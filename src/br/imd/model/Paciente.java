package br.imd.model;

public class Paciente extends Pessoa{
  protected boolean convenio;
  private String[] enfermidadesRegistradas = new String[10];
  
  public Paciente(String nome, String cPF, boolean convenio, String[] enfermidadesRegistradas) {
    super(nome, cPF);
    this.convenio = convenio;
    this.enfermidadesRegistradas = enfermidadesRegistradas;
  }

  public boolean isConvenio() {
    return convenio;
  }

  public void setConvenio(boolean convenio) {
    this.convenio = convenio;
  }

  public String[] getEnfermidadesRegistradas() {
    return enfermidadesRegistradas;
  }

  public void setEnfermidadesRegistradas(String[] enfermidadesRegistradas) {
    this.enfermidadesRegistradas = enfermidadesRegistradas;
  }

  public String toString() {
    return "Paciente: " + nome + ", CPF: " + CPF + ", Convenio: " + (convenio ? "Sim" : "Não");
}

}
