package com.casestudy.casestudy.entity;

import javafx.scene.input.DataFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hopdong")
public class FuramaContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhopdong")
    private Long idContact;

    @Column(name = "idnhanvien")
    private Long idEmployee;

    @Column(name = "idkhachhang")
    private Long idCustomer;

    @Column(name = "iddichvu")
    private Long idService;

    @Column(name = "ngaylamhopdong")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date contactBeginDay;

    @Column(name = "ngayketthuc")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date contactEndDay;

    @Column(name = "tiendatcoc")
    private double deposits;

    @Column(name = "tongtien")
    private double totalPay;

    public Long getIdContact() {
        return idContact;
    }

    public void setIdContact(Long idContact) {
        this.idContact = idContact;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public Date getContactBeginDay() {
        return contactBeginDay;
    }

    public void setContactBeginDay(Date contactBeginDay) {
        this.contactBeginDay = contactBeginDay;
    }

    public Date getContactEndDay() {
        return contactEndDay;
    }

    public void setContactEndDay(Date contactEndDay) {
        this.contactEndDay = contactEndDay;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
}
