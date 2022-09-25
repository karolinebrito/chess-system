package application;

import java.util.Scanner;

import boardergame.Board;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Board board = new Board(8,8);
		
		System.out.println(board);
		
		sc.close();

	}

}
