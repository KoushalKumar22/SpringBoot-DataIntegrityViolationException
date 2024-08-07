package com.example.IntegrityViolationError.Controller;

import com.example.IntegrityViolationError.Entity.Customer;
import com.example.IntegrityViolationError.Exceptions.IdNotFoundException;
import com.example.IntegrityViolationError.Repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }
    @PostMapping("/save")
    public String save(@Valid @RequestBody Customer customer){
        customerRepository.save(customer);
        return "Data Saved";
    }
    @GetMapping("/all")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
    @GetMapping("/id/{id}")
    public Optional<Customer> findById(@PathVariable int id)throws IdNotFoundException {
        Optional<Customer> customers=customerRepository.findById(id);
        if (customers.isEmpty()){
            throw new IdNotFoundException("No User Found By Id: "+id);
        }
        return customers;
    }
}
