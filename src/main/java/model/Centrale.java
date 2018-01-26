package model;


public class Centrale {


  private Integer id;
  private String nature;
  private Integer capacite;
  private Integer energieActuelle;
  private Integer idUtilisateur;

//  public Centrale(Integer id, String nature, Integer capacite, Integer energieActuelle, Integer idUtilisateur) {
//    this.id = id;
//    this.nature = nature;
//    this.capacite = capacite;
//    this.energieActuelle = energieActuelle;
//    this.idUtilisateur = idUtilisateur;
//  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setNature(String nature) {
    this.nature = nature;
  }

  public void setCapacite(Integer capacite) {
    this.capacite = capacite;
  }

  public void setEnergieActuelle(Integer energieActuelle) {
    this.energieActuelle = energieActuelle;
  }

  public void setIdUtilisateur(Integer idUtilisateur) {
    this.idUtilisateur = idUtilisateur;
  }

  public Integer getId() {
    return id;
  }

  public String getNature() {
    return nature;
  }

  public Integer getCapacite() {
    return capacite;
  }

  public Integer getEnergieActuelle() {
    return energieActuelle;
  }

  public Integer getIdUtilisateur() {
    return idUtilisateur;
  }
}
