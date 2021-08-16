package javanapratica;

public class SomaCincoInteiros {

	public static void main(String[] args) {

		int contador = 0;
		int valor = 0;
		
		while (contador<=5) {
			valor += contador;
			contador ++;
		}
		System.out.println("Soma dos 5 = " + valor);
	}

}
