package UTS.No3;

public class Main {
    public static void main(String[] args) {

        UserProfile dataCustomer = new UserProfile(1, 123, "Abhirama", 19, "abhirama@gmail.com", "KTM.jpg");
        Customer customer = new Customer(dataCustomer);
        System.out.println("Login customer :");
        if (customer.log_in(1, 123)) {
            System.out.println("Nama: " + dataCustomer.get_name());
            dataCustomer.show_documents();
            customer.apply_verification("KTM.jpg");
            customer.log_out();
        }

        System.out.println();

        UserProfile dataAdmin = new UserProfile(2, 456, "Budi", 30, "admin@gmail.com", "Admin.pdf");
        Admin admin = new Admin(dataAdmin);
        System.out.println("Login admin :");
        if (admin.log_in(2, 456)) {
            admin.add_vehicle();
            admin.update_vehicle_details(101);
            admin.retrieve_complain();
            admin.verify_user(customer);
            admin.log_out();
        }

        System.out.println();
        System.out.println("Status verifikasi: " + customer.get_verification_status());
    }
}
