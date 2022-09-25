package application;

import java.util.Scanner;

import boardergame.Position;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Position position = new Position(5, 6);
		
		System.out.println(position);
		
		sc.close();

	}

}
