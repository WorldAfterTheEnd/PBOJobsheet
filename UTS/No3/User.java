package UTS.No3;

public class User {
    UserProfile profil;

    User(UserProfile profil) {
        this.profil = profil;
    }

    boolean log_in(int id, int pass) {
        if (profil.get_User_id() == id && profil.get_password() == pass) {
            System.out.println("Login berhasil");
            return true;
        }

        System.out.println("Login gagal");
        return false;
    }

    void recover_password() {
        System.out.println("Pemulihan password");
    }

    void log_out() {
        System.out.println("Logout berhasil");
    }
}