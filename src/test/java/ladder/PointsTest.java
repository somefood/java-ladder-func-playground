package ladder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @DisplayName("연결된 포인트에서 지정된 위치에서 좌우로 움직일 수 있는지 확인한다.")
    @ParameterizedTest
    @CsvSource(value = {"0, 1", "1, 0", "2, 3", "3, 2"})
    void test(int currentIndex, int expected) {
        // given
        Points points = Points.of(List.of(true, false, true, false));
        // when
        int position = points.move(currentIndex);

        // then
        assertThat(position).isEqualTo(expected);
    }

    @DisplayName("연결되지 않은 포인트 간 지정된 위치에서 좌우로 움직일 수 있는지 확인한다.")
    @ParameterizedTest
    @CsvSource(value = {"0, 1", "1, 0", "2, 2", "3, 3"})
    void test2(int currentIndex, int expected) {
        // given
        Points points = Points.of(List.of(true, false, false, false));
        // when
        int position = points.move(currentIndex);

        // then
        assertThat(position).isEqualTo(expected);
    }
}
