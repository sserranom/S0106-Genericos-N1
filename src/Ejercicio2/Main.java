package Ejercicio2;

public class Main {
    public static void main(String[] args){

        Person person1 = new Person("Sergio", "Serrano", 38);
        String message = "Este es un string";
        int num = 2025;

        GenericMethods genericMethods = new GenericMethods();
        genericMethods.showArguments(person1, message, num);

    }
}
