package repository;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;


public class UtilisateurRepository {

  JdbcConnexion jdbcConnexion = new JdbcConnexion();


  public void queryCreerCentrale(String nature, Integer capacite) {

    try {
      jdbcConnexion.insertRequeteSQL("INSERT INTO Centrale (NATURE, CAPACITE) VALUES('" + nature + "','" + capacite + "')");
    } catch (Exception e) {
      System.out.println(e);

    }
  }

  public void creerCompte(String name, String password) {

    try {
      jdbcConnexion.insertRequeteSQL("INSERT INTO Utilisateur (NAME, PASSWORD) VALUES ('" + name + "','" + password + "')");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public ResultSet checkCredential(String name, String password) {

    try {
      return jdbcConnexion.selectRequeteSQL("SELECT NAME, PASSWORD FROM UTILISATEUR WHERE NAME = '" + name + "' AND PASSWORD = '" + password + "' ");

    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }


}
