package prova_java;
import java.util.Scanner;
public class questao7 {
	public static void main(String[]args){
		double dolar = 3.09;
		double real = 1.;
		double dolares;
		double valor_em_real;
		
		Scanner leitura = new Scanner(System.in);
		dolares = leitura.nextDouble();
		valor_em_real = (dolares*3.09);
		System.out.println(valor_em_real);
		
		
		
	}
}
