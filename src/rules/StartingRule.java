package src.rules;

import src.game.Dice;
import src.player.Player;

public interface StartingRule {
    boolean canPlayerStart(Player player, Dice dice);
}