package prova_java;
import java.util.Scanner;
public class questao5 {
public static void main(String[]args){
	double m1;
	double m2;
	double m3;
	Scanner leitura = new Scanner(System.in);
	m1 = leitura.nextDouble();
	m2 = leitura.nextDouble();
	m3 = leitura.nextDouble();
	if(m1 == m2&&m1 == m3){
		System.out.println("Equilatero");
	}if(m1 !=m2 && m2 != m3){
		System.out.println("Escaleno");
	}if(m1 == m2 && m2 != m3 ){
		System.out.println("Isósceles");
	}
	
}
}
