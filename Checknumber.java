import java.util.*;
public class Checknumber {
    // Check the entered number is Positive or Negative 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float num= sc.nextFloat();
        if (num>0) {
            System.out.println("Number is Positive " );
        }
        else if (num<0) {
            System.out.println(" Number is Negative ");
       }
        else {
            System.out.println(" Number is Zero ");
        }  
    }
}
