package com.company.Model;

public class Pracownik extends Konto{

    private int id_pracownik;
    private String stanowisko;
    private int pensja;
    private String data_zatrudnienia;

    public Pracownik(Konto konto, int id_pracownik, String stanowisko, int pensja, String data_zatrudnienia) {
        super(konto.getId_uzytkownika(), konto.getHaslo(), konto.getLogin(), konto.getNazwisko(), konto.getImie());
        this.id_pracownik = id_pracownik;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
        this.data_zatrudnienia = data_zatrudnienia;
    }

    public int getId_pracownik() {
        return id_pracownik;
    }

    public void setId_pracownik(int id_pracownik) {
        this.id_pracownik = id_pracownik;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getData_zatrudnienia() {
        return data_zatrudnienia;
    }

    public void setData_zatrudnienia(String data_zatrudnienia) {
        this.data_zatrudnienia = data_zatrudnienia;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "id_pracownik=" + id_pracownik +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                ", data_zatrudnienia=" + data_zatrudnienia +
                '}' +
                super.toString();
    }
}
