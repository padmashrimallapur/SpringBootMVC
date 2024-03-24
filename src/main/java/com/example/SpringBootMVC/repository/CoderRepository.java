package com.example.SpringBootMVC.repository;

import com.example.SpringBootMVC.model.Coder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoderRepository extends JpaRepository<Coder, Integer> {

    List<Coder> findByName(String name);
}
