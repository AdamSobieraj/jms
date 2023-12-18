package com.example.testjms.receiver;

import com.example.testjms.obiekty.Zamowienie;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ZamowienieMessageListener {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-test")
    public void przetworzZamowienie(Zamowienie zamowienie) {
        System.out.println("Odebrano zamówienie: " + zamowienie.getNumerZamowienia());
    }
}
