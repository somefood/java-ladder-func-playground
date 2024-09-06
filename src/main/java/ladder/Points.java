package ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Points {

    private static final Random RANDOM = new Random();

    private final List<Boolean> points;

    public Points() {
        points = new ArrayList<>();
    }

    public List<Boolean> getPoints() {
        return Collections.unmodifiableList(points);
    }

    public void connectLink(int position) {
        if (canConnectLink(position)) {
            points.add(false);
            return;
        }

        points.add(RANDOM.nextBoolean());
    }

    /**
     * 이전 위치에 가로선이 있으면(true), 현재 위치는 가로선이 올 수 없음
     * @param currentIndex 현재 위치
     * @return
     */
    private boolean canConnectLink(int currentIndex) {
        return currentIndex > 0 && isConnectedToPrevious(currentIndex - 1);
    }

    private boolean isConnectedToPrevious(int previous) {
        return points.get(previous);
    }
}
