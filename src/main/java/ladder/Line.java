package ladder;

import ladder.generator.PointGenerator;

public class Line {
    private final Points points;

    public Line(PointGenerator pointGenerator, int width) {
        this.points = Points.of(pointGenerator.generate(width));
    }

    public Points getPoints() {
        return points;
    }
}
