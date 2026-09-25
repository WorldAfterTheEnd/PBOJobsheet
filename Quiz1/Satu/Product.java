package Quiz1.Satu;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productId;
    private float productPrice;
    private String productType;
    private List<Stock> stocks;
    

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
        this.stocks = new ArrayList<>();
    }

    public void addStock(Stock stock){
        this.stocks.add(stock);
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setProdukType(String productType) {
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public float getProductPrice(){
        return productPrice;
    }

    public String getProdukType(){
        return productType;
    }

    
}
