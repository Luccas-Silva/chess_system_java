package application;

import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Position position = new Position (5, 45);
		
		System.out.append(position.toString());
		
		sc.close();

	}

}
