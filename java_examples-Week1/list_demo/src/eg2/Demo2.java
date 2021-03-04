package eg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		List<Player> playerList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players you wish to create");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details of Player - " + (i + 1));
			System.out.println("Enter Player Id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Player Name");
			String name = sc.nextLine();
			playerList.add(new Player(id, name));
		}
		printPlayerList(playerList);

	}

	public static void printPlayerList(List<Player> playerList) {
		System.out.println("Printing " + playerList.size() + " no of player/s");
		for (Player p : playerList) {
			System.out.println(p);
		}
	}

}
