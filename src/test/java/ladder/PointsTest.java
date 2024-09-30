package ladder;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class PointsTest {

    @Test
    void pointTest() {
        List<Boolean> points = List.of(true, false, true, false);
        assertDoesNotThrow(() -> Points.of(points));
    }

    @Test
    void errorTest() {
        List<Boolean> points = List.of(true, true, true, false);
        assertThatThrownBy(() -> Points.of(points))
            .hasMessage("연속된 가로선은 올 수 없습니다.");
    }
}
