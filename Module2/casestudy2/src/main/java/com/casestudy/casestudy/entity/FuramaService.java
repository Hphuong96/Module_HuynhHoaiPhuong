package com.casestudy.casestudy.entity;

import javax.persistence.*;

@Entity
@Table(name = "dichvu")
public class FuramaService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tendichvu")
    private String serviceName;

    @Column(name = "dientich")
    private int are;

    @Column(name = "sotang")
    private int floorNumber;

    @Column(name = "songuoitoida")
    private int maxPerson;

    @Column(name = "chiphithue")
    private int rentCost;

    @Column(name = "trangthai")
    private String status;

    @Column(name = "kieuthue_id")
    private int idRentType;

    @ManyToOne
    @JoinColumn(name = "loaidichvu_id")
    private FuramaServiceType furamaServiceType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public FuramaServiceType getFuramaServiceType() {
        return furamaServiceType;
    }

    public void setFuramaServiceType(FuramaServiceType furamaServiceType) {
        this.furamaServiceType = furamaServiceType;
    }
}
