package com.company.Model;

public class Konto {

    private int id_uzytkownika;
    private String haslo;
    private String login;
    private String nazwisko;
    private String imie;

    public Konto(){

    }

    public Konto( int id_uzytkownika, String haslo, String login, String nazwisko, String imie) {
        this.id_uzytkownika = id_uzytkownika;
        this.haslo = haslo;
        this.login = login;
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public int getId_uzytkownika() {
        return id_uzytkownika;
    }

    public void setId_uzytkownika(int id_uzytkownika) {
        this.id_uzytkownika = id_uzytkownika;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "id_uzytkownika=" + id_uzytkownika +
                ", haslo='" + haslo + '\'' +
                ", login='" + login + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }
}
