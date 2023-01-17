package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double valueDollar, double dollars) { /* Pode-se receber duas variáveis como argumento normalmente.*/
		return valueDollar * dollars * (1.0 + IOF); /* Aqui se multiplicou por "(1.0 + 0.06)" pois a multiplicação do IOF rtem que ser o valor do real convertido + 6%. */
	}


}
