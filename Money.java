import java.util.*;
public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r =sc.nextFloat();   //  r = Rupee
        // 1 rupee = 100 paise 
        float p = (r*100);
        System.out.println("Rupees :" +r);
        System.out.println("Rupees into Paisa :" +p);
        

    }
}