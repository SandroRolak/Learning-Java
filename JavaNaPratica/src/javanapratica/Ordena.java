package javanapratica;

import java.util.*;

public class Ordena {

	public static void main(String[] args) {

		Scanner infor = new Scanner(System.in);
		int x, y;
		
		System.out.println("Digite o valor de X:");
		x = infor.nextInt();
		System.out.println("Digite o valor de Y:");
		y = infor.nextInt();
		
		if (x>y) {
			System.out.println(y);
			System.out.println(x);
		} else {
			System.out.println(x);
			System.out.println(y);
		}
	}

}
