package com.example.MpesaMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mpesa")
public class MpesaController {
    @GetMapping("/disburse")
    public String disburseFunds(){
        return "Loan has been disbursed successfully";
    }
}
