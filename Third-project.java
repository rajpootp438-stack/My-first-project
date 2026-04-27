import java.util.*;
public class third-project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a salary :");
        int basic = sc.nextInt();
        
        double hra =  basic * 0.20;
        double da = basic * 0.50;
        double pf = basic * 0.11;

        double net_salary = basic+ hra+ da- pf;

        System.out.println("net salary = " + net_salary );
}
}