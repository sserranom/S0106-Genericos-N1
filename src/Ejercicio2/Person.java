package Ejercicio2;

public class Person {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age){

        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Apellido: " + lastName+ ", Edad: " + age;
    }

}
