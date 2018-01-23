import model.Centrale;
import model.Utilisateur;
import org.junit.Test;
import service.UtilisateurService;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UtilisateurServiceTest {

  @Test
  public void getListCentraleUtilisateurDoitRetournerListVideSiPasDeCentraleCree() {
    //GIVEN
    UtilisateurService utilisateurService = new UtilisateurService();

    List<Centrale> listCentraleExpected = new ArrayList();
    Utilisateur utilisateur = Utilisateur.newBuilder().id(1).name("Amaury").password("foo").build();


    //WHEN

    //THEN
    assertThat(utilisateurService.getListCentraleUtilisateur()).isEqualTo(listCentraleExpected);
  }


}
