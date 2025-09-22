package src.rules;

import src.board.Board;
import src.elements.BoardElement;
import src.player.Player;

public class ClassicMovementRule implements MovementRule {
    @Override
    public void move(Player player, int diceRoll, Board board) {
        int newPosition = player.getPosition() + diceRoll;
        
        if (newPosition > board.getSize()) {
            System.out.println("🚫 Cannot move beyond board! Staying at " + player.getPosition());
            return;
        }

        BoardElement element = board.getElementAt(newPosition);
        if (element != null) {
            newPosition = element.interact(newPosition);
        }

        player.setPosition(newPosition);
        System.out.println("➡️  " + player.getName() + " moved to position " + newPosition);
    }
}