package class8;

public class E4BreakKeyword {
    public static void main(String[] args) {

        for (int j=0; j<10; j++){
            if (j>5){
                break;

            }
            System.out.print(j+" ");
        }


        System.out.println();




        int sum=0;
        for (int i=0; i<50; i++){
            sum=sum+i;
            if (sum>=300){
                System.out.print(i);
                break;
            }

        }









    }
}
