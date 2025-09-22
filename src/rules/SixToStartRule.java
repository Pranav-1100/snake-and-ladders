package src.rules;

import src.game.Dice;
import src.player.Player;

public class SixToStartRule implements StartingRule {
    @Override
    public boolean canPlayerStart(Player player, Dice dice) {
        if (player.getPosition() > 0) {
            return true; // Already started
        }

        player.takeTurn();
        int roll = dice.roll();
        System.out.println("🎲 " + player.getName() + " rolled: " + roll + " (need 6 to start)");

        if (roll == 6) {
            System.out.println("✅ " + player.getName() + " can start!");
            return true;
        } else {
            System.out.println("❌ " + player.getName() + " needs a 6 to start!");
            return false;
        }
    }
}