package UTS.No3;

class Customer extends User {
    boolean verification_status = false;

    Customer(UserProfile profil) {
        super(profil);
    }

    boolean get_verification_status() {
        return verification_status;
    }

    void apply_verification(String doc) {
        System.out.println("Mengajukan verifikasi: " + doc);
    }
}