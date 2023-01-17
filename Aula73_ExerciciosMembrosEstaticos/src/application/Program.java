package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		double valueDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bougth? ");
		double dollars = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(valueDollar, dollars); /* Pode-se passar 2 variáveis como argumento para o método normalmente. */

		System.out.printf("Amount to be paid in reais = R$ %.2f", result);
		
		
		sc.close();

	}

}
