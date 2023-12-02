package app.shopping.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ShoppingCart {
    private String id;
    private String customerId;
    private List<Product> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
}
