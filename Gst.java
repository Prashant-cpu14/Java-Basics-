
import java.util.*;
public class Gst {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       float pen = sc.nextFloat();
       float penc= sc.nextFloat();
       float era = sc.nextFloat();
       float cost= pen + penc + era;
       float tax = cost + (0.18f * cost);
       System.out.println("cost :" + cost);
     System.out.println(" GST TAX :" + tax);
    }
}
