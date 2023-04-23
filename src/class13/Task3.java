package class13;

public class Task3 {
    public static void main(String[] args) {
        String str="shmJBhsiJwb#!%^";
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str.length()str1.length());
    }
}
