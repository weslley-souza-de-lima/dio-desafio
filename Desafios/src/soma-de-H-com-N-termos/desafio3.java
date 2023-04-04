import java.util.Scanner;
import static java.lang.Math.round;
public class desafio3{

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     for (int i = 1; i <= n; i++) {
     h = h + (double)1/i;
           
      }
      
     System.out.println(round(h));
       
   }
}