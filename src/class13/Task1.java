package class13;

public class Task1 {
    public static void main(String[] args) {

        String str="Java";

        if (!str.isBlank()&& str.length()%2!=0&& str.length()=3){
            int middleIndwx=str.length()/2;
            char middleChar=str.charAt(middleIndwx);
            System.out.println(middleChar);

        }




    }
}
