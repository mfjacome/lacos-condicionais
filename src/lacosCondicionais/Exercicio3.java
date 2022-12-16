package lacosCondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;
//import java.lang.Math;


public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número qualquer:\n");
		DecimalFormat teste = new DecimalFormat("0.0000");
		num = ler.nextFloat();
		
		if(num % 2 == 0) {
			double raiz = Math.sqrt(num);
			System.out.println(num+" é par e a raiz quadrada = "+ teste.format(raiz));
		}else {
			double quadrado = Math.pow(num, 2);
			System.out.println(num+" é impar e o quadrado = "+ teste.format(quadrado));
		}
			
	}

}


