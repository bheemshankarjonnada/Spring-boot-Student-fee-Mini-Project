package com.example.Spring_First_Application.Controller;


import com.example.Spring_First_Application.Repository.StudentRepository;
import com.example.Spring_First_Application.Service.PaymentService;
import com.example.Spring_First_Application.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class OrderController {

    private final StudentRepository studentRepository;
    private final Map<String,PaymentService>paymentService;

    @Autowired
    public OrderController(StudentRepository studentRepository, Map<String,PaymentService>paymentService) {
        this.paymentService = paymentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/fees")
    public String fees(@RequestParam String name, @RequestParam int age, @RequestParam double amount, @RequestParam String method) {
        Student student = new Student(name, age);
        String SavedMessage = studentRepository.SaveStudents(student);
        PaymentService ChooseMethod= paymentService.get(method);
        if(ChooseMethod == null){
            return "Invalid Method :"+method;
        }
        String PaymentMessage=ChooseMethod.pay(name, amount);

        return SavedMessage + "|" + PaymentMessage;
    }
}