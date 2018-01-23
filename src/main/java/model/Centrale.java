package model;

public class Centrale {

private final Integer id;
private final String nature;
private final Integer capacite;

  public Centrale(Integer id, String nature, Integer capacite) {
    this.id = id;
    this.nature = nature;
    this.capacite = capacite;
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
}
