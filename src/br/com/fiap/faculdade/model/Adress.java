package br.com.fiap.faculdade.model;

public class Adress {
    private String street;
    private int cep;
    private int number;

    private City city;

    public Adress(){

    }
    public Adress(String street, int cep, int number, City city) {
        this.street = street;
        this.cep = cep;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
