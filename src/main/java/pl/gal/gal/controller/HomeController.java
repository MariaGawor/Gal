package pl.gal.gal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String homeAction(){
        return "index";
    }
}
