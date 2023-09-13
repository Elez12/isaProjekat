package com.isaProjekat.springboot.direktorijumZaposleni.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "zaposlen")
public class Zaposlen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ime")
    private String ime;

    @Column(name = "prezime")
    private String prezime;

    @Column(name = "email")
    private String email;

    public Zaposlen() {

    }

    public Zaposlen(int id, String ime, String prezime, String email) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }


    public Zaposlen(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // define tostring

    @Override
    public String toString() {
        return "Zaposlen [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", email=" + email + "]";
    }

}











