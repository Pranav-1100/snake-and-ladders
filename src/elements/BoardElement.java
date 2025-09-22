package src.elements;

import src.board.Coordinate;

public abstract class BoardElement {
    protected final Coordinate start;
    protected final Coordinate end;

    public BoardElement(Coordinate start, Coordinate end) {
        this.start = start;
        this.end = end;
    }

    public Coordinate getStart() {
        return start;
    }

    public Coordinate getEnd() {
        return end;
    }

    public abstract int interact(int currentPosition);
}