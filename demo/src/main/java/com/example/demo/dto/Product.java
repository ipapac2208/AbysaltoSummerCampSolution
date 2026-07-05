package com.example.demo.dto;

public class Product {
    private Integer id;
    private String ime;
    private String opis;
    private Double cijena;
    private byte[] slika;
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

    public byte[] getSlika() {
        return slika;
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
    public void setSlika(byte[] slika) {
        this.slika = slika;
    }
}
