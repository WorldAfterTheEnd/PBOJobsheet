package UTS.No3;

public class Admin extends User {
    Admin(UserProfile profil) {
        super(profil);
    }

    void update_vehicle_details(int vehicle_id) {
        System.out.println("Data kendaraan diperbarui: " + vehicle_id);
    }

    void add_vehicle() {
        System.out.println("Kendaraan berhasil ditambahkan");
    }

    void retrieve_complain() {
        System.out.println("Mengambil data keluhan");
    }

    void verify_user(Customer customer) {
        customer.verification_status = true;
        System.out.println("Customer berhasil diverifikasi");
    }
}