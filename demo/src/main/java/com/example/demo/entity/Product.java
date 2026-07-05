package com.example.demo.entity;

public class Product {
    private Integer id;
    private String ime;
    private String opis;
    private Double cijena;
    private String slika;
    private String kategorija;

    public Integer getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getOpis() {
        return opis;
    }

    public Double getCijena() {
        return cijena;
    }

    public String getSlika() {
        return slika;
    }
    public String getKategorija() {
        return kategorija;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setOpis(String opis) {
        this.opis = opis;
    }
    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }
    public void setSlika(String slika) {
        this.slika = slika;
    }
    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }
}
