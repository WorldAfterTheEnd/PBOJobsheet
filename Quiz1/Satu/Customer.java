package Quiz1.Satu;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private int phone;


    public Customer(int customerId, String customerName, String address, int phone){
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public int getCustomerId(){
        return customerId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getAddress(){
        return address;
    }

    public int getPhone(){
        return phone;
    }

    
}
