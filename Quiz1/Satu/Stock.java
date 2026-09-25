package Quiz1.Satu;

public class Stock {
    private int quantity;
    private int shopNo;
    
    public Stock(int quantity, int shopNo) {
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    
}
