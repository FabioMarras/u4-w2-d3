import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product Shampo = new Product(1L, "shampo1", "shampo", 120.5);
        Product toy1 = Product.toy1;
        Product Libro1 = Product.Libro;
        Product Libro2 = Product.Libro2;
        Product Libro3 = Product.Libro3;

        List<Product> prodotti = new ArrayList<>(List.of(Shampo, toy1, Libro1, Libro2, Libro3));

        List<Product> ordine1 = new ArrayList<>();
        ordine1.add(Shampo);
        ordine1.add(toy1);

        List<Product> ordine2 = new ArrayList<>();
        ordine2.add(Shampo);

        List<Product> ordine3 = new ArrayList<>();
        ordine3.add(Shampo);
        ordine3.add(toy1);
        ordine3.add(toy1);

        List<List<Product>> ordiniTotali = new ArrayList<>();
        ordiniTotali.add(ordine1);
        ordiniTotali.add(ordine2);
        ordiniTotali.add(ordine3);

        Customer Fabio = new Customer(10L, "Fabio", 1);

        Order primo = new Order(99L, "pending", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 10, 20), ordine1, Fabio);
        //System.out.println(primo);
        //System.out.println(prodotti);

        System.out.println("******* ESERCIZIO 1 *******");
        Predicate<Product> isMoreThan100 = Product -> Product.price > 100;
        Predicate<Product> sameCategory = Product -> Product.category == "book";
        prodotti.stream().filter(isMoreThan100.and(sameCategory)).forEach(System.out::println);

        System.out.println("******* ESERCIZIO 2 *******");
        Predicate<List<Product>> sameCategory2 = Product2 -> Product2.stream().anyMatch(product -> product.category == "baby");
        ordiniTotali.stream().filter(sameCategory2).forEach(System.out::println);
        ordiniTotali.stream().anyMatch(List -> List.stream().anyMatch(product -> "baby" == product.category));

        System.out.println("******* ESERCIZIO 3 *******");
    }
}