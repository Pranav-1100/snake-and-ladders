package src.rules;

import src.game.Dice;
import src.player.Player;

public class AnyNumberStartingRule implements StartingRule {
    @Override
    public boolean canPlayerStart(Player player, Dice dice) {
        if (player.getPosition() > 0) {
            return true; // Already started
        }
        System.out.println(player.getName() + " can start with any number!");
        return true;
    }
}