import java.util.*;
public class first-project {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    System.out.println("enter a input : ");
    int n = sc.nextInt();

     int hundread = n / 100;
     int tens = (n/10)%10;
     int once = n % 10;

     double weight = (hundread * 3) + (tens * 2) + (once * 1);
       System.out.println( "weight sum = " + weight);

    }
}