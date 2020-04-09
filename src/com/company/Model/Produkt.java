package com.company.Model;

public class Produkt {

    private int id_produkt;
    private String nazwa_producenta;
    private String nazwa_produktu;
    private String kategoria;

    public Produkt(int id_produkt, String nazwa_producenta, String nazwa_produktu, String kategoria) {
        this.id_produkt = id_produkt;
        this.nazwa_producenta = nazwa_producenta;
        this.nazwa_produktu = nazwa_produktu;
        this.kategoria = kategoria;
    }

    public int getId_produkt() {
        return id_produkt;
    }

    public void setId_produkt(int id_produkt) {
        this.id_produkt = id_produkt;
    }

    public String getNazwa_producenta() {
        return nazwa_producenta;
    }

    public void setNazwa_producenta(String nazwa_producenta) {
        this.nazwa_producenta = nazwa_producenta;
    }

    public String getNazwa_produktu() {
        return nazwa_produktu;
    }

    public void setNazwa_produktu(String nazwa_produktu) {
        this.nazwa_produktu = nazwa_produktu;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id_produkt=" + id_produkt +
                ", nazwa_producenta='" + nazwa_producenta + '\'' +
                ", nazwa_produktu='" + nazwa_produktu + '\'' +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }
}
