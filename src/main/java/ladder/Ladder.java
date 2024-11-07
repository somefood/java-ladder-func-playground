package ladder;

import java.util.ArrayList;
import java.util.List;
import ladder.generator.PointGenerator;

public class Ladder {

    private final List<Line> lines;

    public Ladder(PointGenerator pointGenerator, final Size size) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < size.getHeight(); i++) {
            lines.add(new Line(pointGenerator.generate(size.getWidth())));
        }
        this.lines = lines;
    }

    public List<Line> getLines() {
        return new ArrayList<>(lines);
    }

    public int play(int currentIndex) {
        for (Line line : lines) {
            currentIndex = line.move(currentIndex);
        }
        return currentIndex;
    }
}

