package com.example.LoanMicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/loan")
public class LoanManagementController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/apply")
    public String applyForLoan(){
//        Call Mpesa microservice to disburse funds
        String mpesaResponse = restTemplate.getForObject("http://127.0.0.1:8080/mpesa/disburse",String.class);
        return mpesaResponse;
    }
}
