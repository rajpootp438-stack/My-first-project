import java.util.*;
public class fourth-project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println(" enter a value a and b : ");
         long a = sc.nextInt();
         long b = sc.nextInt();

         long sum = a + b;
         

          if(sum>Integer.MAX_VALUE){
            System.out.println("overflow");

          }else{
            System.out.println("safe");
          }
         
    }
}