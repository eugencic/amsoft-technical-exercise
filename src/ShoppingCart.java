import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public void displayShoppingCart() {
        System.out.println("Products from the shopping cart:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice() + "$");
            System.out.println("Quantity: " + product.getQuantity() + "pcs");

            if (product instanceof Book) {
                Book book = (Book) product;
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Genre: " + book.getGenre());
            } else if (product instanceof Electronics) {
                Electronics electronics = (Electronics) product;
                System.out.println("Brand: " + electronics.getBrand());
                System.out.println("Model: " + electronics.getModel());
            }

            System.out.println();
        }
        System.out.println("Total Price: " + calculateTotalPrice() + "$");
    }
}
