package service;

import model.Centrale;
import model.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurService {

  private List<Centrale> listCentraleUtilisateur = new ArrayList<>();


  public void creerCentrale(String nature, Integer capacite) {
    Centrale centraleCreeParUtilisteur = new Centrale(listCentraleUtilisateur.size(), nature, capacite);
    listCentraleUtilisateur.add(centraleCreeParUtilisteur);

  }

  public List<Centrale> getListCentraleUtilisateur() {
    return listCentraleUtilisateur;
  }


}


