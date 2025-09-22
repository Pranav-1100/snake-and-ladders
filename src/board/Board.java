package src.board;

import src.elements.BoardElement;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int size;
    private final Map<Integer, BoardElement> elements;

    public Board(int size) {
        this.size = size;
        this.elements = new HashMap<>();
    }

    public int getSize() {
        return size;
    }

    public void addElement(BoardElement element) {
        elements.put(element.getStart().getPosition(), element);
    }

    public BoardElement getElementAt(int position) {
        return elements.get(position);
    }
}