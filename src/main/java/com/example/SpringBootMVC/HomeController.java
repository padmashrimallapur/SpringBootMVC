package com.example.SpringBootMVC;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public void home(){
        System.out.println("home Page is requested");
    }
}
