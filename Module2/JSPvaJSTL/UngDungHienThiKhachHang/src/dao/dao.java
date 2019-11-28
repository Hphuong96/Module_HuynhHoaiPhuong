package dao;


import java.util.*;
import model.Customer;

public class dao {
    private static final Map<Integer, Customer> listCUSTOMER = new HashMap<Integer, Customer>();

    static {
        initCustomer();
    }
    private static void initCustomer() {
        Customer cus1 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus2 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus3 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus4 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus5 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus6 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus7 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus8 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus9 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus10 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus11 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus12 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus13 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus14 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus15 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus16 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus17 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus18 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus19 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus20 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus21 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus22 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        Customer cus23 = new Customer(123456789,"Nguyen Van A", "1999-12-12", "affasa@gmail.com","DaNang");
        listCUSTOMER.put(1,cus1);
        listCUSTOMER.put(2,cus2);
        listCUSTOMER.put(3,cus3);
        listCUSTOMER.put(4,cus4);
        listCUSTOMER.put(5,cus4);
        listCUSTOMER.put(6,cus4);
        listCUSTOMER.put(7,cus4);
        listCUSTOMER.put(8,cus4);
        listCUSTOMER.put(9,cus4);
        listCUSTOMER.put(10,cus4);
        listCUSTOMER.put(11,cus4);
        listCUSTOMER.put(12,cus4);
        listCUSTOMER.put(13,cus4);
        listCUSTOMER.put(14,cus4);
        listCUSTOMER.put(15,cus4);
        listCUSTOMER.put(16,cus4);
        listCUSTOMER.put(17,cus4);
        listCUSTOMER.put(18,cus4);
        listCUSTOMER.put(19,cus4);
        listCUSTOMER.put(20,cus4);
        listCUSTOMER.put(21,cus4);
        listCUSTOMER.put(22,cus4);
        listCUSTOMER.put(23,cus4);
    }
    public static List<Customer> getAllCustomer(){
        Collection<Customer> customers = listCUSTOMER.values();
        List<Customer> list = new ArrayList<Customer>(customers);
        return list;
    }
}