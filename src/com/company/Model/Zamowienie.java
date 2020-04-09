package com.company.Model;

import java.util.Date;

public class Zamowienie {

    private int id_zamowienia;
    private int id_koszyk;
    private Date data_zalozenia;
    private String status_realizacji;
    private int cena;

    public Zamowienie(int id_zamowienia, int id_koszyk, Date data_zalozenia, String status_realizacji, int cena) {
        this.id_zamowienia = id_zamowienia;
        this.id_koszyk = id_koszyk;
        this.data_zalozenia = data_zalozenia;
        this.status_realizacji = status_realizacji;
        this.cena = cena;
    }

    public int getId_zamowienia() {
        return id_zamowienia;
    }

    public void setId_zamowienia(int id_zamowienia) {
        this.id_zamowienia = id_zamowienia;
    }

    public int getId_koszyk() {
        return id_koszyk;
    }

    public void setId_koszyk(int id_koszyk) {
        this.id_koszyk = id_koszyk;
    }

    public Date getData_zalozenia() {
        return data_zalozenia;
    }

    public void setData_zalozenia(Date data_zalozenia) {
        this.data_zalozenia = data_zalozenia;
    }

    public String getStatus_realizacji() {
        return status_realizacji;
    }

    public void setStatus_realizacji(String status_realizacji) {
        this.status_realizacji = status_realizacji;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "id_zamowienia=" + id_zamowienia +
                ", id_koszyk=" + id_koszyk +
                ", data_zalozenia=" + data_zalozenia +
                ", status_realizacji='" + status_realizacji + '\'' +
                ", cena=" + cena +
                '}';
    }
}
