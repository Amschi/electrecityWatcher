package web;


import model.Centrale;
import model.Utilisateur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.UtilisateurService;


@Controller
public class HomeController {


  UtilisateurService utilisateurService = new UtilisateurService();

  @GetMapping("/")
  public String root() {
    return "register";
  }


  @GetMapping("/login")
  public String loginForm(Model model) {
    model.addAttribute("utilisateur", new Utilisateur());
    return "login";
  }


  @PostMapping("/login")
  public String loginSubmit(@ModelAttribute Utilisateur utilisateur) {
    if (utilisateurService.identifier(utilisateur.getName(), utilisateur.getPassword()).equals("inscrit")) {
      return "/user/index";
    } else {
      return "/error/access-denied";
    }
  }


  @GetMapping("/register")
  public String registerForm(Model model) {
    model.addAttribute("utilisateur", new Utilisateur());
    return "register";
  }


  @PostMapping("/register")
  public String registerSubmit(@ModelAttribute Utilisateur utilisateur) {
    if (utilisateurService.inscription(utilisateur.getName(), utilisateur.getPassword()).equals("creation")) {
      return "login";
    } else {
      return "/error/access-denied";
    }
  }

  @GetMapping("/centraleInput")
  public String plantForm(Model model) {
    model.addAttribute("centrale", new Centrale());
    return "centraleInput";
  }

  @PostMapping("/centraleInput")
  public String plantSubmit(@ModelAttribute Centrale centrale) {
    if (utilisateurService.creerCentrale(centrale.getNature(), centrale.getCapacite()).equals("creationCentrale")) {
      return "centraleManagement";
    } else {
      return "/error/access-denied";
    }
  }

  @GetMapping("/centraleManagement")
  public String plantManagement(Model model) {
    model.addAttribute("centrale", new Centrale());
    return "centraleManagement"; }


  @GetMapping("/access-denied")
  public String accessDenied() {
    return "/error/access-denied";
  }}

