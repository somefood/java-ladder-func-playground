package ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Points {

    private final List<Boolean> points;

    private Points(List<Boolean> points) {
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

    public static Points of(List<Boolean> points) {
        return new Points(points);
    }

    public List<Boolean> getPoints() {
        return Collections.unmodifiableList(points);
    }
}
