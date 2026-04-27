public class LearningWhile
{
 public static void main(String [] args) {
 Scanner sc = new Scanner(System.in);
 int number;
 int digit;
 int reverse = 0;
 System.out.print("Enter the number : ");
 number = sc.nextInt(); // mera helping variable // 123
 int temp = number;
 while(number != 0) // 0 != 0 => false
 {
 digit = number % 10; // 1 % 10 = 1 // isse digit nikal aayegi unit digit.
 number = number / 10 ; // 0 / 10 = 0
 reverse = reverse * 10 + digit;
 } // while end
 // palindromkuuuu ka logic :
 if(temp == reverse)
 {
 System.out.println(temp + " is palindrom");
 }
 else{
 System.out.println(temp + " is not palindrom");
 }
 }
}