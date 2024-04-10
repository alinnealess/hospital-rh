package br.imd.model;

public class Paciente extends Pessoa{
  protected boolean convenio;
  private String[] enfermidadesRegistradas = new String[10];
  private Medico[] medicosAtendentes = new Medico[10];

  public Paciente(String nome, String cPF, boolean convenio) {
    super(nome, cPF);
    this.convenio = convenio;
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

  public Medico[] getMedicosAtendentes() {
    return medicosAtendentes;
  }

  public void setMedicosAtendentes(Medico[] medicosAtendentes) {
    this.medicosAtendentes = medicosAtendentes;
  }

  

}
