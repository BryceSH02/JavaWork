package class11;

public class E7Array2D {
    public static void main(String[] args) {

        boolean[][] arr2D={
                {true,false,true,true,false},
                {true,false,false,false,false}
        };
        int counter=0;
        for (boolean[]arr1D:arr2D){
            for (boolean answr:arr1D){
                if (answr){
                    counter++;
                }
            }
        }

        System.out.println(counter);




    }
}
