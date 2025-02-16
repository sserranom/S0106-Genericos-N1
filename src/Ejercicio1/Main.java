package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 700.50, 25);
        Product product2 = new Product("Impresora", 75.50, 10);
        Product product3 = new Product("Monitor", 150.50, 30);

        NoGenericMethods products = new NoGenericMethods(product1, product2, product3);

        products.setFirstArgument(product1);
        products.setSecondArgument(product2);
        products.setThirdArgument(product3);

        System.out.println("Primer Argumento: " + products.getFirstArgument());
        System.out.println("Segundo Argumento: " + products.getSecondArgument());
        System.out.println("Tercer Argumento: " + products.getThirdArgument());

        System.out.println("\n Comprobamos que los argumentos pueden ponerse en cualquier posicion en la llamada al constructor\n");
        products.setFirstArgument(product3);
        products.setSecondArgument(product1);
        products.setThirdArgument(product2);

        System.out.println("Primer Argumento: " + products.getFirstArgument());
        System.out.println("Segundo Argumento: " + products.getSecondArgument());
        System.out.println("Tercer Argumento: " + products.getThirdArgument());

    }

}