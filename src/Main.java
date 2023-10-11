import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product Shampo = new Product(1L, "shampo1", "shampo", 120.5);
        Product shampo2 = Product.Shampo2;
        Product Libro1 = Product.Libro;
        Product Libro2 = Product.Libro2;
        Product Libro3 = Product.Libro3;
        List<Product> prodotti = new ArrayList<>(List.of(Shampo, shampo2, Libro1, Libro2, Libro3));
        List<Product> spesa = new ArrayList<>();
        spesa.add(Shampo);
        spesa.add(shampo2);
        Customer Fabio = new Customer(10L, "Fabio", 1);
        Order primo = new Order(99L, "pending", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 10, 20), spesa, Fabio);
        //System.out.println(primo);
        //System.out.println(prodotti);

        Predicate<Product> isMoreThan100 = Product -> Product.price > 100;
        Predicate<Product> sameCategory = Product -> Product.category == "book";
        prodotti.stream().filter(isMoreThan100.and(sameCategory)).forEach(System.out::println);
    }

}