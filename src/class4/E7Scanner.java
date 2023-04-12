package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scan.next();

        if(name.equals("Elena")){
            System.out.println("Mac user");
        } else if (name.equals("Bryce") ){
            System.out.println("Naughty");
        } else if (name.equals("Halima")) {
            System.out.println("Best");

        }


    }
}
