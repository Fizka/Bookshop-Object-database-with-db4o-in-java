package com.company.Model;

public class Klient extends Konto {

    private String email;
    private String adres;
    private int telefon;

    public Klient()
    {
        super();
    }

    public Klient(Konto konto, String email, String adres, int telefon) {
        super(konto.getId_uzytkownika(), konto.getHaslo(), konto.getLogin(), konto.getNazwisko(), konto.getImie());
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Klient{" +
                " email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon=" + telefon + " " +
                 "} "
                + super.toString();
    }
}
