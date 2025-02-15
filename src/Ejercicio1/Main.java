package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 700.50, 25);
        Product product2 = new Product("Impresora", 75.50, 10);
        Product product3 = new Product("Monitor", 150.50, 30);

        NoGenericMethods first = new NoGenericMethods(product1, product2, product3);
        NoGenericMethods second = new NoGenericMethods(product3, product1, product2);


        System.out.println(first.getAllArguments());
        System.out.println(second.getAllArguments());

        System.out.println("\n Comprobamos que los argumentos pueden ponerse en cualquier posicion en la llamada al constructor\n");
        first.setFirstArgument(product3);
        first.setSecondArgument(product1);
        first.setThirdArgument(product2);

        System.out.println(first.getAllArguments());

    }


}