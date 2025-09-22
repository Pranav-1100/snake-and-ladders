package src.rules;

import src.board.Board;
import src.player.Player;

public interface WinningRule {
    boolean hasWon(Player player, Board board);
}