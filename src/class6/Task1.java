package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("What is your height in in.");
        int height= scan.nextInt();
        if(height<60){
            System.out.println("You are short");
        }else if (height>=60 && height<=72) {
            System.out.println("You are medium");
        } else if (height>72) {
            System.out.println("You are tall");
        }


    }
}
