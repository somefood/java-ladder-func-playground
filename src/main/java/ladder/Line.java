package ladder;

public class Line {
    private final Points points;

    public Line(int width) {
        this.points = new Points();
        for (int i = 0; i < width - 1; i++) {
            points.connectLink(i);
        }
    }

    public Points getPoints() {
        return points;
    }
}
