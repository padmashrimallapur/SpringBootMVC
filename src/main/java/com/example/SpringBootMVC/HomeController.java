package com.example.SpringBootMVC;
import com.example.SpringBootMVC.model.Coder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m){

        int res = i+j;
        m.addAttribute("res", res);

        return "results";
    }

    @RequestMapping("addCoder")
    public String addCoder(@ModelAttribute("c") Coder c){
        return "results";
    }
}
