package ladder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LineTest {

    @Test
    void 정상적으로_생성된_경우() {
        assertDoesNotThrow(() -> {
            final int width = 5;
            Line line = new Line(i -> List.of(true, false, true, false, true), width);
        });
    }

    @Test
    void 예외발생_연속된_가로선이_오는경우() {
        Assertions.assertThatThrownBy(() -> {
                Line line = new Line(i -> List.of(true, true, true, false, true), 4);
            }).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("연속된 가로선은 올 수 없습니다.");
    }
}
