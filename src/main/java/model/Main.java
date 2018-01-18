package bean;

public class Main {
  public static void main(String[] args) {

  Utilisateur.Builder builder = new Utilisateur.Builder();

  builder.name("Amaury").id(12).build();

  System.out.print(builder);

  }

}
