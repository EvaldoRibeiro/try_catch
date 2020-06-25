package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		File file = new File("c:\\tmp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.hasNextLine());
				
							}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: "+ e.getLocalizedMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally bloco executando!");
		}
	}

}
