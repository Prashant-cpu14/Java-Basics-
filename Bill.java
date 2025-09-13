
import java.util.*;
public class Bill {
    public static void main(String.args[]) {
      Scanner sc = new Scanner(System.in);
       float pen = sc.nextFloat();   //Pen
       float penc= sc.nextFloat();   //Pencil
       float era = sc.nextFloat();  // Eraser
       float cost= pen + penc + era;   // Cost of these 
           // calcuting the cost with GST 
       float Newcost = cost + (0.18f * cost);
       System.out.println("cost :" + cost);
     System.out.println(" New Total Cost :" +Newcost );
    }
}
