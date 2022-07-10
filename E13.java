package aula_13;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("quanto você ganha por hora: " );
		double hora = scan.nextDouble();
		
		System.out.println("quantas horas você trabalha: ");
		double trabalha = scan.nextDouble();
		
		//salario bruto
		double bruto = hora * trabalha;
		System.out.println("salário bruto: " + bruto +"R$");
		
		//INSS 8%
		double inss = (bruto * 8/100);
		System.out.println("INSS: " + inss + "R$");
		
		//sindicato 5%
		double sind = (bruto * 5/100);
		System.out.println("Sindicato: " + sind + "R$");
		

		//descontos = sind + inss + impposto de renda
		//imposto de renda
		double ir = (bruto *11)/100;
		double desc = ir + sind + inss;
		System.out.println("Valor dos descontos: " + desc + "R$");
		
		//salário liq 
		double liq = bruto - desc;
		System.out.println("Salário líquido: " + liq + "R$");

		
		
		scan.close();

		
		
		
		

		
		
	}

}
