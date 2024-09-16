package ladder;

import java.util.ArrayList;
import java.util.List;
import ladder.generator.PointGenerator;

public class Ladder {

    private final PointGenerator pointGenerator;
    private final Lines lines;

    public Ladder(PointGenerator pointGenerator, final Size size) {
        this.pointGenerator = pointGenerator;
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < size.getHeight(); i++) {
            lines.add(new Line(pointGenerator, size.getWidth()));
        }
        this.lines = Lines.of(lines);
    }

    public Lines getLines() {
        return lines;
    }
}

