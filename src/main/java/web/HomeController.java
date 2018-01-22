package web;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

  public String loginForm() {
    return "hello";
  }

}

