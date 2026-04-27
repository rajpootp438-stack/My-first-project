import java.util.*;
public class second-project {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter b : ");
        int b = sc.nextInt();

        double kb = b / 1024;
        double mb = b / (1024 *1024);
        double REMAINING_BYTES = b % 1024;
        System.out.println(kb + " " + mb  + "" + REMAINING_BYTES);
     }
}