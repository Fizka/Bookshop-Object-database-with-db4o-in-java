package com.company.Model;

public class Koszyk {

    private int id_koszyk;
    private int id_produkt;
    private int ilosc;

    public Koszyk(int id_koszyk, int id_produkt, int ilosc) {
        this.id_koszyk = id_koszyk;
        this.id_produkt = id_produkt;
        this.ilosc = ilosc;
    }

    public int getId_koszyk() {
        return id_koszyk;
    }

    public void setId_koszyk(int id_koszyk) {
        this.id_koszyk = id_koszyk;
    }

    public int getId_produkt() {
        return id_produkt;
    }

    public void setId_produkt(int id_produkt) {
        this.id_produkt = id_produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Koszyk{" +
                "id_koszyk=" + id_koszyk +
                ", id_produkt=" + id_produkt +
                ", ilosc=" + ilosc +
                '}';
    }
}
