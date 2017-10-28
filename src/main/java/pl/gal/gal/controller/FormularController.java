package pl.gal.gal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gal.gal.entity.Formular;

@Controller
@RequestMapping("/form")
public class FormularController {



  @GetMapping("/")
    public String getMapping(Model model){
      Formular formular = new Formular() ;
      model.addAttribute("formular" , formular) ;
      return "formular" ;
  }






}
