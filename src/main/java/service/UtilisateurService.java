package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UtilisateurRepository;

import java.sql.SQLException;


public class UtilisateurService {


  UtilisateurRepository utilisateurRepository = new UtilisateurRepository();


  public String identifier(String name, String password) {

    try {
      if (utilisateurRepository.checkCredential(name, password).next()) {
        System.out.println("tada");
        return "inscrit";
      } else {
        System.out.println("pala");
        return "pas inscrit";
      }
    } catch (SQLException e) {
      e.printStackTrace();

    }
    return null;
  }

  public String inscription(String name, String password) {
    if (identifier(name, password).equals("inscrit")) {
      return "Utilisateur existe déjà";
    } else {
      utilisateurRepository.creerCompte(name, password);
      return "creation";
    }
  }

  public String creerCentrale(String nature, Integer capacite) {
    utilisateurRepository.queryCreerCentrale(nature, capacite);
    return "creationCentrale";
  }


}



