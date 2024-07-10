package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    private AtomicInteger nextId = new AtomicInteger(1);

    public List<Customer> getAllCustomers() {
    	Customer a = new Customer();
    	a.setName("sdjdkf");
        return customers;
    }

    public Optional<Customer> getCustomerById(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst();
    }

    public Customer createCustomer(Customer customer) {
        customer.setId(nextId.getAndIncrement());
        customers.add(customer);
        return customer;
    }

    public Customer updateCustomer(int id, Customer customerDetails) {
        Customer customer = getCustomerById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setName(customerDetails.getName());
        customer.setEmail(customerDetails.getEmail());
        customer.setAddress(customerDetails.getAddress());
        customer.setPhone(customerDetails.getPhone());
        return customer;
    }

    public void deleteCustomer(int id) {
        Customer customer = getCustomerById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customers.remove(customer);
    }
}
