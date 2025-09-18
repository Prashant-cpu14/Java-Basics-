import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = (int) Math.sqrt(num);
        if (sqrt*sqrt==num) {
            System.out.println(num +" is a Perefct Square");
        }
        else{
            System.out.println(num +" is not a Perfect Square");
        }
    }
}
