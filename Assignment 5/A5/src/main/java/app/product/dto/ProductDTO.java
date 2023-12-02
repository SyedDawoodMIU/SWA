package app.product.dto;

public class ProductDTO {
    private String id;
    private String name;
    private double price;

    public ProductDTO() {
    }

    public ProductDTO(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name +
                ", phoneNumber='" + price +
                '}';
    }
}
