package com.example.SpringBootMVC;

import com.example.SpringBootMVC.model.Coder;
import com.example.SpringBootMVC.repository.CoderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CoderController {

    @Autowired
    CoderRepository coderRepository;

    @GetMapping("/coders")
    public String getCoders(){
        List<Coder> coder =  coderRepository.findAll();
        return coder.toString();
    }

    @GetMapping("/coder/{id}")
    public Coder getCoder(@PathVariable("id") int id){
        Coder coder = coderRepository.findById(id).get();
        return coder;
    }

    @PostMapping("coder")
    public Coder addCoder( Coder coder){
        coderRepository.save(coder);
        return coder;
    }
}
