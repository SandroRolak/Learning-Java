package javanapratica;

public class AreaCirculo {

	public static void main(String[] args) {

		int raio = 2;
		double area;
		double pi = Math.PI;
		double potencia = Math.pow(raio, 2);
		
		area = pi * potencia;
		System.out.println("Área do Círculo é " + (float)area);
	}

}
