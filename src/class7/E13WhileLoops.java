package class7;

import java.util.Scanner;

public class E13WhileLoops {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Give me a number");
        int num1= scan.nextInt();

        int count=1;
        while (count<=num1){
            System.out.print(count+" ");
            count++;
        }




    }
}
