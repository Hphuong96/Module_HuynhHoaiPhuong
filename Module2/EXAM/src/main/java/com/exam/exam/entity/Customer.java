package com.exam.exam.entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkhachhang")
    private Long idCustomer;

    @Column(name = "hoten")
    @NotEmpty(message = "Khong Duoc De Trong")
    private String name;

    @Column(name = "gioitinh")
    @NotNull(message = "Khong Duoc De Trong")
    private String gender;

    @Column(name = "ngaysinh")
    @NotNull(message = "Khong Duoc De Trong")
    private Date birthday;

    @Column(name = "socmnd")
    @NotEmpty(message = "So CMND khong dc de trong")
    @Pattern(regexp = "^([0-9]{9}|[0-9]{12})$",message = "So cmnd phai la 9 hoac 12 so")
    private String idCard;

    @Column(name = "email")
    @NotNull(message = "Khong Duoc De Trong")
    @Pattern(regexp = "^(\\w{1,20})(@[a-zA-Z0-9]{2,8})(.(\\w{2,4})){1,3}$" , message = "email phai dung dinh dang")
    private String email;

    @Column(name = "loaiKhachhang")
    @NotNull(message = "Khong Duoc De Trong")
    private String type;

    @Column(name = "sodienthoai")
    @NotEmpty(message = "sdt khong dc de trong")
    @Pattern(regexp = "^([0-9]{10})$" ,message = "So dien thoai phai du 10 so")
    private String phone;

    @Column(name = "diachi")
    @NotNull(message = "Khong Duoc De Trong")
    private String address;

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
