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
        Product forBoys = Product.forBoys;
        Product forBoys1 = Product.forBoys1;

        List<Product> prodotti = new ArrayList<>(List.of(Shampo, toy1, Libro1, Libro2, Libro3, forBoys, forBoys1));

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
        Customer Andrea = new Customer(11L, "Andrea", 2);
        Customer Giuseppe = new Customer(12L, "Giuseppe", 2);

        Order primo = new Order(99L, "pending", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 10, 20), ordine1, Fabio);
        //System.out.println(primo);
        //System.out.println(prodotti);
        Order secondo = new Order(101L, "pending", LocalDate.of(2021, 1, 1), LocalDate.of(2023, 10, 20), ordine1, Andrea);
        Order terzo = new Order(102L, "pending", LocalDate.of(2021, 3, 11), LocalDate.of(2021, 3, 20), ordine1, Giuseppe);

        System.out.println("******* ESERCIZIO 1 *******");
        Predicate<Product> isMoreThan100 = Product -> Product.price > 100;
        Predicate<Product> sameCategory = Product -> Product.category == "book";
        prodotti.stream().filter(isMoreThan100.and(sameCategory)).forEach(System.out::println);

        System.out.println("******* ESERCIZIO 2 *******");
        Predicate<List<Product>> sameCategory2 = products -> products.stream().anyMatch(product -> product.category.equals("baby"));
        ordiniTotali.stream().filter(sameCategory2).forEach(System.out::println);
        //ordiniTotali.stream().anyMatch(List -> List.stream().anyMatch(product -> "baby" == product.category));

        System.out.println("******* ESERCIZIO 3 *******");
        Predicate<Product> sameCategory3 = product -> product.category.equals("boys");
        List<Product> xx= prodotti.stream().filter(sameCategory3).map(product -> {
            product.setPrice(product.getPrice()*0.9);
            return product;
        }).toList();
        System.out.println(xx);

        System.out.println("******* ESERCIZIO 4 *******");
        Predicate<Customer> sameCategory4 = Customer -> Customer.tier == 2;
    }
}