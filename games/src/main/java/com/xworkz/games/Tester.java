package com.xworkz.games;

import java.util.Scanner;
import com.xworkz.games.dao.GamesDAO;
import com.xworkz.games.dto.GamesDTO;

public class Tester {
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

		System.out.println("enter a game id ");
		int id = scanner.nextInt();

		System.out.println("enter a game name ");
		String name = scanner.next();

		System.out.println("Enter a no of playes ");
		int player = scanner.nextInt();

		System.out.println("Enetr a game type");
		String type = scanner.next();

		GamesDTO dto = new GamesDTO(id, name, player, type);

		boolean SaveStatus = GamesDAO.saveGame(dto);
		if (SaveStatus) {
			System.out.println("Save Successfully");
		} else {
			System.out.println("Save Unsuccessfully");
		}
	}
}


