package ladder;

public class Position {

    private final int currentIndex;

    public Position(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    @Override
    public String toString() {
        return "Position{" +
            "currentIndex=" + currentIndex +
            '}';
    }
}
