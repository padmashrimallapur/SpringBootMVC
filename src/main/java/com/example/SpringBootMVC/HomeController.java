package com.example.SpringBootMVC;
import com.example.SpringBootMVC.model.Coder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

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
        List<Coder> coderList = Arrays.asList(new Coder(101, "Ansh"), new Coder(103, "Ram"));
        m.addAttribute("result",coderList);
        return "showCoders";
    }

    @RequestMapping("addCoder")
    public String addCoder(@ModelAttribute("c") Coder c){
        return "results";
    }
}
