package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="njkaSDFDFD12349!@#$%";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[0-9]","%"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));


        char c='A';
        c++;
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.println(c++);
        }

    }
}
