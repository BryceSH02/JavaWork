package class12;

public class E12StringDemo {
    public static void main(String[] args) {

        String sentence="yup we have another class";
        System.out.println(sentence.substring(12));
        System.out.println(sentence.substring(4,11));

        int startIndex=sentence.length()-5;
        System.out.println(sentence.substring(startIndex));
    }
}
