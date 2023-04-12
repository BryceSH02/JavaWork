package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        Scanner star=new Scanner (System.in);
        System.out.println("Give me a starting number");
        int start= star.nextInt();
        int end=star.nextInt();
        int step=star.nextInt();

        while (start<=end);{
            System.out.print(start+" ");
            start=start+step;
start++;
        }


        }





    }

