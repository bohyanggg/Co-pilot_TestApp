package com.example.demo.service;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.dto.CustomerSaveDTO;
import com.example.demo.dto.CustomerUpdateDTO;
 
import java.util.List;
 
public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);
 
    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);
 
    boolean deleteCustomer(int id);
}