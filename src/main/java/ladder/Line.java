package ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private static final Random RANDOM = new Random();
    
    private final List<Boolean> points;

    public Line(int width) {
        points = new ArrayList<>();

        for (int i = 0; i < width - 1; i++) {
            connectLink(i);
        }
    }

    private void connectLink(int position) {
        if (isConnectedToPrevious(position)) {
            points.add(false);
            return;
        }

        points.add(RANDOM.nextBoolean());
    }

    public List<Boolean> getPoints() {
        return new ArrayList<>(points);
    }

    /**
     * 이전 위치에 가로선이 있으면(true), 현재 위치는 가로선이 올 수 없음
     * @param i
     * @return
     */
    private boolean isConnectedToPrevious(int i) {
        return i > 0 && points.get(i - 1);
    }
}
