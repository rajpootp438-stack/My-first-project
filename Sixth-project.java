import java.util.*;
public class sixth-project {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length and weight : ");
    int lenght = sc.nextInt();
    int weight = sc.nextInt();
    
    if(lenght>0 && weight>0){
     int perimeter = 2 * (lenght+weight);
     System.out.println("area of perimeter "+ perimeter);
    }else{
        System.out.println("invalid");
    }
    
}

}