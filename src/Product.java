public class Product {
    public Long id;
    public String name;
    public String category;
    public Double price;

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
    static Product Shampo2 = new Product(2L, "shampo2", "shampo", 10.5);
    static Product Shampo3 = new Product(3L, "shampo3", "shampo", 10.5);
    static Product Libro = new Product(2L, "book1", "book", 13.9);
    static Product Libro2 = new Product(3L, "book2", "book", 19.9);
    static Product Libro3 = new Product(4L, "book3", "book", 190.9);
    static Product toy1 = new Product(5L, "toy1", "baby", 241.7);
    static Product forBoys = new Product(5L, "gameBoy", "boys", 120.7);
    static Product forBoys1 = new Product(5L, "PSP", "boys", 220.7);

    public Product getShampo2() {
        return Shampo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
