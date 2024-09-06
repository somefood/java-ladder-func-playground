package ladder;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final Lines lines;

    public Ladder(final Size size) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < size.getHeight(); i++) {
            lines.add(new Line(size.getWidth()));
        }
        this.lines = Lines.of(lines);
    }

    public Lines getLines() {
        return lines;
    }
}

