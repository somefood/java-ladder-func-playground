package ladder.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPointGenerator implements PointGenerator {

    private static final Random RANDOM = new Random();

    @Override
    public List<Boolean> generate(int width)  {
        final List<Boolean> points = new ArrayList<>();
        for (int i = 0; i < width - 1; i++) {
            connectLink(points, i);
        }

        return points;
    }

    public void connectLink(List<Boolean> points, int position) {
        if (canConnectLink(points, position)) {
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
    private boolean canConnectLink(List<Boolean> points, int currentIndex) {
        return currentIndex > 0 && isConnectedToPrevious(points,currentIndex - 1);
    }

    private boolean isConnectedToPrevious(List<Boolean> points, int previous) {
        return points.get(previous);
    }
}


