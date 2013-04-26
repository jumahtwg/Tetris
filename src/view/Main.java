package view;

import java.util.Scanner;

import controller.Controller;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Breite des Spielfeldes angeben:");
		int width = scanner.nextInt();
		System.out.println("Höhe des Spielfeldes angeben:");
		int height = scanner.nextInt();
		
		Controller ctrl = new Controller();
		ctrl.init(width, height);
		scanner.close();
	}

}
