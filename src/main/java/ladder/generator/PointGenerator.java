package ladder.generator;

import java.util.List;

@FunctionalInterface
public interface PointGenerator {

    List<Boolean> generate(int width);
}
