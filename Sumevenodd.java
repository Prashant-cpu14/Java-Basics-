import java.util.*;
public class Sumevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEven =0;
        int sumOdd = 0;
        System.out.print("How many numbers you want to input");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " integers");
        for(int i =0; i<n; i++){
            int num = sc.nextInt();
          if (num % 2 == 0) {
                sumEven += num; 
            } else {
                sumOdd += num;  
            }
        }
        System.out.println("Sum of Even number" +sumEven);
        System.out.println("Sum of Odd number" +sumOdd);
    }
}
