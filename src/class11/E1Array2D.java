package class11;

public class E1Array2D {
    public static void main(String[] args) {

        int[][] arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
//odd numbers

        };

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]%2==1){
                    System.out.println(arr[row][col]);
                }
            }
        }


    }



}
