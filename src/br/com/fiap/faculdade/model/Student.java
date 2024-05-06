package br.com.fiap.faculdade.model;

public class Student {

    private int id;
    private String name;
    private Adress adress;

    public Student(){

    }

    public Student(int id, String name, Adress adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
