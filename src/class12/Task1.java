package class12;

public class Task1 {
    public static void main(String[] args) {
        String username="Classybirf40";
        String password="Gemo90";
        String confirmPassword="Gemo90";
        if (username.isEmpty()||password.isEmpty()){
            System.out.println("Username and password cannot be empty");
        }
       else if (password.length()<8){
            System.out.println("Password is to short");
        }else if (password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if (!(password ==confirmPassword)){
            System.out.println("Password do not match ");
        }else {
            System.out.println("Your username ans password has been completed");
        }
    }
}
