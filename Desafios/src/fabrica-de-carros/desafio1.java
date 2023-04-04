import java.util.Scanner;

public class Desafio1{

	public static void main(String[] args) {

	 Scanner scan = new Scanner(System.in);

     
     Double custoFabrica = scan.nextDouble();
     Double porcentagemDistribuidor = scan.nextDouble();
     Double percentualImpostos = scan.nextDouble();
     
     Double valorDistribuidor = custoFabrica * (porcentagemDistribuidor / 100);

     Double valorImpostos = custoFabrica * (percentualImpostos / 100);

     Double precoFinal = custoFabrica + valorDistribuidor + valorImpostos;

     System.out.println(String.format("%.0f", precoFinal));
 
    }
}  