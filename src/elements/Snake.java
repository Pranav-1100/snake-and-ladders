package src.elements;

import src.board.Coordinate;

public class Snake extends BoardElement {
    public Snake(Coordinate start, Coordinate end) {
        super(start, end);
    }

    @Override
    public int interact(int currentPosition) {
        System.out.println("🐍 Snake bite! Going down from " + currentPosition + " to " + end.getPosition());
        return end.getPosition();
    }
}