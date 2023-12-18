package com.example.testjms.obiekty;

import java.io.Serializable;

public class Zamowienie implements Serializable {
    private int numerZamowienia;
    private String produkt;
    private int ilosc;

    public Zamowienie(int numerZamowienia, String produkt, int ilosc) {
        this.numerZamowienia = numerZamowienia;
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    public int getNumerZamowienia() {
        return numerZamowienia;
    }

    public void setNumerZamowienia(int numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}