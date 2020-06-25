package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("Fim do Programa!!!");
	}
	public static void method1() {
		System.out.println("***Metodo1 Start***");
		method2();
		System.out.println("***Metodo1 End***");
	}
	
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Metodo2 Start***");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição a inválida! ");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException r) {
			System.out.println("Ivanlido erro");
		}

		sc.close();
		System.out.println("***Metodo2 End***");
	}

}
