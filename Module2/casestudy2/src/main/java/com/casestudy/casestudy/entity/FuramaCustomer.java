package com.casestudy.casestudy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Entity
@Table(name = "khachhang")
public class FuramaCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkhachhang")
    private long idCustomer;

    @Column(name = "idloaikhach")
    private long idCustomerType;

    @Column(name = "hoten")
    @NotEmpty(message = "Ten Khong Duoc De trong")
    private String customerName;

//    @DateTimeFormat(pattern="dd/MM/yyyy")
//    @NotNull
//    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)",message = "Vui long nhap ngay sinh dung dinh dang")
    @Column(name = "ngaysinh")
    @NotNull(message = "ngay sinh khong dc de trong")
    private Date birthday;

    @Column(name = "socmtnd")
    @NotEmpty(message = "So CMND khong dc de trong")
    @Pattern(regexp = "^([0-9]{9}|[0-9]{12})$",message = "So cmnd phai la 9 hoac 12 so")
    private String idCard;

    @Column(name = "sdt")
    @NotEmpty(message = "sdt khong dc de trong")
    @Pattern(regexp = "^([0-9]{10})$" ,message = "So dien thoai phai du 10 so")
    private String phoneNumber;

    @Column(name = "email")
    @Pattern(regexp = "^(\\w{1,20})(@[a-zA-Z0-9]{2,8})(.(\\w{2,4})){1,3}$" , message = "email phai dung dinh dang")
    private String email;

    @Column(name = "diachi")
    @NotEmpty(message = "dia chi khong dc de trong")
    private String address;

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public long getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(long idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
