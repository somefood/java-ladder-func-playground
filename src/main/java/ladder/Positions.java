package ladder;

import java.util.ArrayList;
import java.util.List;

public class Positions {

    private final List<Position> positions;

    private Positions(final List<Position> positions) {
        this.positions = positions;
    }

    public static Positions initWith(int size) {
        List<Position> positions = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            positions.add(new Position(i));
        }
        return new Positions(positions);
    }

    public void move(Ladder ladder) {
        this.positions.forEach(position -> {
            int finalPosition = ladder.play(position.getCurrentIndex());
            position.updateCurrentIndex(finalPosition);
        });
    }

    public List<Position> getPositions() {
        return new ArrayList<>(positions);
    }
}
