package ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Line {

    private final List<Boolean> points;

    public Line(List<Boolean> points) {
        validate(points);
        this.points = new ArrayList<>(points);
    }

    private void validate(List<Boolean> points) {
        for (int i = 0; i < points.size() - 1; i++) {
            if (points.get(i) && points.get(i + 1)) {
                throw new IllegalArgumentException("연속된 가로선은 올 수 없습니다.");
            }
        }
    }

    public static Line of(List<Boolean> points) {
        return new Line(points);
    }

    public List<Boolean> getPoints() {
        return Collections.unmodifiableList(points);
    }

    public int move(int currentIndex) {
        if (currentIndex < 0 || currentIndex >= points.size()) {
            throw new IllegalArgumentException("해당 위치에 사다리가 없습니다.");
        }
        
        // 현재 위치가 true이면 오른쪽으로 이동 가능
        if (points.get(currentIndex)) {
            return currentIndex + 1;
        }

        // 이전 위치가 0 이상이어야하고, 이전 위치가 true이면 왼쪽으로 이동 가능
        if (currentIndex - 1 >= 0 && points.get(currentIndex - 1)) {
            return currentIndex - 1;
        }

        return currentIndex;
    }
}
