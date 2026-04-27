import java.util.*;
public class fifth-project {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a,b,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int product = (a%10)*(b%10)*(c%10);

        System.out.println("product : "+ product);
        

}

}