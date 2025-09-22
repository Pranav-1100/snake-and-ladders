package src.player;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private static final Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void takeTurn() {
        System.out.print(name + ", press Enter to roll dice...");
        scanner.nextLine();
    }
}