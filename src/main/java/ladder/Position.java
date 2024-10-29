package ladder;

public class Position {

    private final int startIndex;
    private int currentIndex;

    public Position(int startIndex) {
        this.startIndex = startIndex;
        this.currentIndex = startIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
    
    public void updateCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}
