package src.elements;

import src.board.Coordinate;

public class Ladder extends BoardElement {
    public Ladder(Coordinate start, Coordinate end) {
        super(start, end);
    }

    @Override
    public int interact(int currentPosition) {
        System.out.println("🪜 Ladder climb! Going up from " + currentPosition + " to " + end.getPosition());
        return end.getPosition();
    }
}