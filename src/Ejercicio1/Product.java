package Ejercicio1;

public class Product {

    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + name + ", Precio: " + price + ", Stock: " + stock;
    }
}
