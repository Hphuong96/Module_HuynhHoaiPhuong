package com.casestudy.casestudy.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class FuramaServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tendichvu")
    private String nameService;

    @OneToMany(targetEntity = FuramaService.class)
    private List<FuramaService> furamaServices;

    public FuramaServiceType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public List<FuramaService> getFuramaServices() {
        return furamaServices;
    }

    public void setFuramaServices(List<FuramaService> furamaServices) {
        this.furamaServices = furamaServices;
    }
}
