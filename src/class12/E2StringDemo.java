package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String password="paa123";
        if (userName.length()>8 && password.length()>8){
            System.out.println("Username and password can't be more than 8 characters");
        }else {
            System.out.println("Signup successful");
        }
    }
}
