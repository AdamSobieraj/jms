package com.example.testjms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;
import com.example.testjms.obiekty.Zamowienie;

@RestController
@RequestMapping("/messages")
public class ZamowienieController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/przetworz")
    public ResponseEntity<String> przetworzZamowienie(@RequestBody Zamowienie zamowienie) {
        jmsTemplate.convertAndSend("queue-test", zamowienie);
        return ResponseEntity.ok("Zamówienie przetworzone i przesłane do kolejki JMS.");
    }

}
