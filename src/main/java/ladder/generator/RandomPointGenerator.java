package ladder.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPointGenerator implements PointGenerator {

    private static final Random RANDOM = new Random();

    @Override
    public List<Boolean> generate(int width)  {
        final List<Boolean> points = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            connectLink(points, i, width);
        }

        return points;
    }

    private void connectLink(List<Boolean> points, int position, int width) {
        if (canNotConnect(points, position, width)) {
            points.add(false);
            return;
        }

        points.add(RANDOM.nextBoolean());
    }

    /**
     * 이전 위치에 가로선이 있으면(true), 현재 위치는 가로선이 올 수 없음
     *
     * @param currentIndex 현재 위치
     * @param width       전체 너비
     * @return
     */
    private boolean canNotConnect(List<Boolean> points, int currentIndex, int width) {
        return isLastPosition(currentIndex, width) ||
                (currentIndex > 0 && isConnectedToPrevious(points, currentIndex - 1));
    }

    private boolean isLastPosition(int currentIndex, int width) {
        return currentIndex >= width - 1;
    }

    private boolean isConnectedToPrevious(List<Boolean> points, int previousIndex) {
        return points.get(previousIndex);
    }
}


