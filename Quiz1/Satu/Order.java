package Quiz1.Satu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private float amount;
    private LocalDateTime orderDate;
    private Customer customers; //relasi Customer
    private List<Product> products; //relasi Product

    public Order(int orderId, float amount, LocalDateTime orderDate, Customer customers) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customers = customers;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public float getAmount() {
        return amount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Customer getCustomers() {
        return customers;
    }

    public List<Product> getProducts() {
        return products;
    }



}
