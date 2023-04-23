package class11;

public class E5Array2D {
    public static void main(String[] args) {

        int[][] arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}

        };
        int counter=0;
        for (int[] arr1 : arr) {
            for (int num : arr1) {
                if (num%2==0){
                    counter++;
                }
            }

            }
        System.out.println(counter);
        }




    }

