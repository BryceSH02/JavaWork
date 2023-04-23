package class12;

public class E1StringClassDemo {
    public static void main(String[] args) {

      //  String s=new String("Leandro");
        String string1="Leandro";
        System.out.println(string1.length());

        String name="Axel";
        if (name.length()>8){
            System.out.println("Only 8 characters are allowed");
        }else{
            System.out.println(name);
        }
    }
}
