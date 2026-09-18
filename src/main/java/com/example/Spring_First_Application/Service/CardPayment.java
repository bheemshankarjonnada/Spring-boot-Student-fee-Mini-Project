package com.example.Spring_First_Application.Service;

import org.springframework.stereotype.Service;

@Service
public class CardPayment implements PaymentService{

    @Override
    public String pay(String name, double amount){
        return name +"Paid  Amount :"+amount+" Using Card 💳";


    }
}
