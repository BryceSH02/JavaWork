package class9;

import java.util.Scanner;

public class E13Arrays {
    public static void main(String[] args) {

        int [] numbers=new int[3];
       Scanner  Scanner=new Scanner(System.in);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Please enter int number");
            numbers[i]=Scanner.nextInt();
        }
        for(int number:numbers){
            System.out.println(number);
        }



    }
}
