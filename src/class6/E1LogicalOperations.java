package class6;

public class E1LogicalOperations {
    public static void main(String[] args) {

        boolean choc=true;
        boolean flowwrs=false;
      if(choc||flowwrs){ // .|| means or and either option must be true only 1 needed
          System.out.println("I am happy");
      }  else {
          System.out.println("I am sad");
      }

      boolean fiveG=true;
      boolean wifi=false;

      if(wifi||fiveG){
          System.out.println("You can browse the internet");
      }else{
          System.out.println("Not connected to internet");
      }







    }
}
