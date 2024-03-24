package com.example.SpringBootMVC;
import com.example.SpringBootMVC.model.Coder;
import com.example.SpringBootMVC.repository.CoderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @Autowired
    CoderRepository repository;

    @ModelAttribute
    public void getModelData(Model m){
        m.addAttribute("name", "Coder1");
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("getCoders")
    public String getCoders(Model m){

        m.addAttribute("result",repository.findAll());
        return "showCoders";
    }

    @GetMapping("getCoderByName")
    public String getCoderByName(@RequestParam String name,  Model m){
        m.addAttribute("result", repository.findByName(name));
        return "showCoders";
    }

    @RequestMapping("addCoder")
    public String addCoder(@ModelAttribute("c") Coder c){
        repository.save(c);
        return "results";
    }
}
