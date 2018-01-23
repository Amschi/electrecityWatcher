package model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Map;


public class Utilisateur {

  private final Integer id;
  private final String name;
  private final String password;
  private final List<Centrale> listCentrale;
  private final Map<String, Integer> historiqueProduction;

  private Utilisateur(Integer id, String name, String password, List<Centrale> listCentrale, Map<String, Integer> historiqueProduction) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.listCentrale = listCentrale;
    this.historiqueProduction = historiqueProduction;
  }

  public List<Centrale> getListCentrale() {
    return listCentrale;
  }

  public Integer getId() {
    return id;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {

    private Integer Id;
    private String name;
    private String password;
    private List<Centrale> listCentrale;
    private Map<String, Integer> historiqueProduction;



    public Builder id(Integer id) {
      Id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public Builder listCentrale(List<Centrale> listCentrale) {
      this.listCentrale = listCentrale;
      return this;
    }

    public Builder historiqueProduction(Map<String, Integer> historiqueProduction) {
      this.historiqueProduction = historiqueProduction;
      return this;
    }

    public Utilisateur build() {
      return new Utilisateur(this.Id, this.name, this.password, this.listCentrale, this.historiqueProduction);
    }


    }
  }






