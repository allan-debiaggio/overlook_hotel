package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> findAll() { return repository.findAll(); }
    public Optional<Customer> findById(Long id) { return repository.findById(id); }
    public Customer save(Customer customer) { return repository.save(customer); }
    public void delete(Long id) { repository.deleteById(id); }
}
