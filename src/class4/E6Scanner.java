package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scan.next();

        if(name.equals("Elena")){
            System.out.println("Mac user");
        }else{
            System.out.println("Window user");
        }








    }
}
