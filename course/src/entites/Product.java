package course.src.entites;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product () {}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Product data: ".concat(name)
        .concat(" $ ").concat(String.format("%.2f", price))
        .concat(", ").concat(String.valueOf(quantity))
        .concat(" quantity, ").concat("units Total: $ ")
        .concat(String.format("%.2f",totalValueInStock()));
    }
}
