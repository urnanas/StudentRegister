package br.com.fiap.faculdade.view;

import br.com.fiap.faculdade.model.Adress;
import br.com.fiap.faculdade.model.City;
import br.com.fiap.faculdade.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Student student = new Student();


        do{
            System.out.println("Choose one of the options: \n 1- Register Student\n 2- Show Student \n 0- Sair ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("What is the student's name? ");
                    String name = sc.next() + sc.nextLine();

                    System.out.println("What is the student's ID? ");
                    int id = sc.nextInt();

                    System.out.println("What is the student's adress(Street)? ");
                    String street = sc.next()+ sc.nextLine();

                    System.out.println("CEP? ");
                    int cep = sc.nextInt();

                    System.out.println("House's number? ");
                    int number = sc.nextInt();

                    System.out.println("What is the student's city? ");
                    String cityName = sc.next()+ sc.nextLine();

                    System.out.println("State? ");
                    String state = sc.next()+ sc.nextLine();

                    City city = new City(cityName, state);
                    Adress adress = new Adress(street, cep, number, city);


                    student.setName(name);
                    student.setId(id);
                    student.setAdress(adress);

                    System.out.println("Registered!");
                    break;
                case 2:
                    System.out.println("Name: " + student.getName() + "\nID: " + student.getId());
                    System.out.println(student.getAdress().getStreet() + student.getAdress().getNumber() + student.getAdress().getCep());
                    System.out.println(student.getAdress().getCity().getName() + "/" + student.getAdress().getCity().getState());
                    break;
                case 0:
                    System.out.println("Closing system");
                    break;
                default:
                    System.out.println("Invalid option");
            }


        }while(op != 0);
        sc.close();
    }
}
