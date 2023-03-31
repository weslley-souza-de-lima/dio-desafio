import java.util.Scanner;

public class desafio2 {
	
  public static void main(String[] args) {

     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;

        for (int i = 0; i <6 ; i ++) { 
         x = leitor.nextDouble();
         i = i;

          if (  x > 0) {
            cont++;
            media += x;
          }

          }
         media = media / cont;
           System.out.println(cont + " valores positivos");
           System.out.println(String.format("%.1f", media));
    }   
}	
