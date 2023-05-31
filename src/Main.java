public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Book book1 = new Book("Hamlet", 14.99, 2, "William Shakespeare", "Tragedy");
        Book book2 = new Book("Ethics", 9.99,1, "Baruch Spinoza", "Treatise");
        Book book3 = new Book("Pride and Prejudice", 11.99, 3, "Jane Austen", "Romance novel");

        Electronics electronics1 = new Electronics("iPhone 12", 699.99, 3, "Apple", "iPhone 12");
        Electronics electronics2 = new Electronics("Samsung Galaxy S21", 799.99, 2, "Samsung", "Galaxy S21");
        Electronics electronics3 = new Electronics("Lenovo Legion 5", 1399.99, 1, "Lenovo", "Legion 5");

        shoppingCart.addProduct(book1);
        shoppingCart.addProduct(book2);
        shoppingCart.addProduct(book3);

        shoppingCart.addProduct(electronics1);
        shoppingCart.addProduct(electronics2);
        shoppingCart.addProduct(electronics3);

        shoppingCart.displayShoppingCart();
    }
}
