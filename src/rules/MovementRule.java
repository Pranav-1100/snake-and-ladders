package src.rules;

import src.board.Board;
import src.player.Player;

public interface MovementRule {
    void move(Player player, int diceRoll, Board board);
}