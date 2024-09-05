package ladder;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    public Ladder(final Size size) {
        lines = new ArrayList<>();
        for (int i = 0; i < size.getHeight(); i++) {
            lines.add(new Line(size.getWidth()));
        }
    }

    public List<Line> getLines() {
        return new ArrayList<>(lines);
    }
}

