package com.example.demo.CustomerController;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    
    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO CustomerDTO) {
        return "Customer saved";
    }
}
