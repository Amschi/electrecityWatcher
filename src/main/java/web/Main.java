package web;

import model.Utilisateur;
import repository.UtilisateurRepository;
import service.UtilisateurService;

public class Main {

  public static void main(String [] args) {
    UtilisateurRepository utilisateurRepository = new UtilisateurRepository();
    UtilisateurService utilisateurService = new UtilisateurService();


    utilisateurService.identifier("Kevin", "123");
  }

}
