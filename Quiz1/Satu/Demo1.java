package Quiz1.Satu;

import java.time.LocalDateTime;

public class Demo1 {
    public static void main(String[] args) {
        //Customer
        Customer customer1 = new Customer(101, "Muhammad Abhirama", "Malang", 81234567);
        
        System.out.println("- Data Customer:");
        System.out.println("    ID Customer : " + customer1.getCustomerId());
        System.out.println("    Nama        : " + customer1.getCustomerName());
        System.out.println("    Alamat      : " + customer1.getAddress());
        System.out.println("    No. HP      : " + customer1.getPhone());
        System.out.println();

        //untuk produk dan stock
        Product product1 = new Product(501, 1500000, "Electronics");
        product1.addStock(new Stock(10, 101)); // 10 unit di Shop 101
        product1.addStock(new Stock(5, 102));  // 5 unit di Shop 102

        Product product2 = new Product(502, 350000, "Accessories");
        product2.addStock(new Stock(50, 101)); //50 unit di Shop No. 101

        System.out.println("Data Produk Dibuat:");
        System.out.println("- Produk 1 ID: " + product1.getProductId() + " | Tipe: " + product1.getProdukType() + " | Harga: Rp" + product1.getProductPrice());
        System.out.println("- Produk 2 ID: " + product2.getProductId() + " | Tipe: " + product2.getProdukType() + " | Harga: Rp" + product2.getProductPrice());
        System.out.println();

        //total dan order1
        float totalAmount = product1.getProductPrice() + product2.getProductPrice();
        Order order1 = new Order(1, totalAmount, LocalDateTime.now(), customer1);

        // menambahkan Produk ke dalam Order
        order1.addProduct(product1);
        order1.addProduct(product2);

        //Menampilkan Detail Order
        System.out.println("    Pesanan");
        System.out.println("ID Order     : " + order1.getOrderId());
        System.out.println("Tanggal      : " + order1.getOrderDate());
        System.out.println("Total Amount : Rp" + order1.getAmount());
        System.out.println();
    }
}