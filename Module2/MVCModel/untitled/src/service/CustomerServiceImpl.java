package service;


import model.Customer;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> listCustomer;

    static {
        listCustomer = new HashMap<>();
        listCustomer.put(1, new Customer(123456789, "Nguyen Van A", "12345@gmail.com", "DA NANG"));
        listCustomer.put(2, new Customer(223456789, "Nguyen Van B", "12345@gmail.com", "DA NANG"));
        listCustomer.put(3, new Customer(323456789, "Nguyen Van C", "12345@gmail.com", "DA NANG"));
        listCustomer.put(4, new Customer(423456789, "Nguyen Van D", "12345@gmail.com", "DA NANG"));
        listCustomer.put(5, new Customer(523456789, "Nguyen Van E", "12345@gmail.com", "DA NANG"));
        listCustomer.put(6, new Customer(623456789, "Nguyen Van F", "12345@gmail.com", "DA NANG"));
        listCustomer.put(7, new Customer(723456789, "Nguyen Van G", "12345@gmail.com", "DA NANG"));
    }

    @Override
    public List<Customer> findAll() {
//        Collection<Customer> customers = listCustomer.values();
//        List<Customer> list = new ArrayList<Customer>(customers);
//        list.addAll(customers);
//        return list;
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public void save(Customer customer) {
        listCustomer.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return listCustomer.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        listCustomer.put(id, customer);
    }

    @Override
    public void remove(int id) {
        listCustomer.remove(id);
    }

    public static List<Customer> getAllCustomer() {
        Collection<Customer> customers = listCustomer.values();
        List<Customer> list = new ArrayList<Customer>(customers);
        return list;
    }
}
