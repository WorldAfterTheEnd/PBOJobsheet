package UTS.No3;

public class UserProfile {
    int user_id;
    int password;
    String name;
    int age;
    String email_id;
    String doc;

    UserProfile(int id, int pass, String nama, int umur, String email, String dokumen) {
        user_id = id;
        password = pass;
        name = nama;
        age = umur;
        email_id = email;
        doc = dokumen;
    }

    int get_User_id() {
        return user_id;
    }

    int get_password() {
        return password;
    }

    String get_name() {
        return name;
    }

    int get_age() {
        return age;
    }

    String get_email() {
        return email_id;
    }

    void edit_profile(String nama) {
        name = nama;
    }

    void show_documents() {
        System.out.println("Dokumen: " + doc);
    }
}