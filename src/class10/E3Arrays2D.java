package class10;

public class E3Arrays2D {
    public static void main(String[] args) {

        int[][] matrix={

                {10,20,30},
                {20,50,65},
                {102,54,60}
        };
        int [] arr1=matrix[2];

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
         arr1=matrix[1];
        System.out.println();

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
