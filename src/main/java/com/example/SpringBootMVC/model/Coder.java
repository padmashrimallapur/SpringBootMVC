package com.example.SpringBootMVC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Coder {

    @Id
    int cid;
    String name;


    private Coder(){

    }

    public Coder(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Coder{" +
                "cid=" + cid +
                ", name=" + name +
                '}';
    }
}
