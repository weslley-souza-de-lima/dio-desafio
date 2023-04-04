import java.util.Scanner;
public class desafio4{ 
    
  public static void main(String[] args){
    int casos, poderDeLuta;

    Scanner scan = new Scanner(System.in);

    casos = scan.nextInt();

    for(int i = 0; i < casos; i++){
        poderDeLuta= scan.nextInt();
    
        if(poderDeLuta <= 8000){
            System.out.println("Inseto!");
        } else {
            System.out.println("Mais de 8000!");
        }
    }
   }

}