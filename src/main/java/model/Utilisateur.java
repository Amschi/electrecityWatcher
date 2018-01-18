package bean;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

  private final Integer id;
  private final String name;
  private final String password;
  private final List<Centrale> listCentrale;
  private final Map<String, Integer> historiqueProduction;

  private Utilisateur(Builder builder) {
    this.id = builder.getId();
    this.name = builder.getName();
    this.password = builder.getPassword();
    this.listCentrale = builder.getListCentrale();
    this.historiqueProduction = builder.getHistoriqueProduction();
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

    Builder() {
    }

    Utilisateur build() {
      return new Utilisateur(this);
    }

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

    public Integer getId() {
      return Id;
    }

    public String getName() {
      return name;
    }

    public String getPassword() {
      return password;
    }

    public List<Centrale> getListCentrale() {
      return listCentrale;
    }

    public Map<String, Integer> getHistoriqueProduction() {
      return historiqueProduction;
    }
  }

}




