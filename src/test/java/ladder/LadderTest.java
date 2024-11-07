package ladder;

import ladder.generator.PointGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @DisplayName("지정한 위치에서 사다리를 타고 도착지점을 찾는다.")
    @ParameterizedTest
    @CsvSource(value = {"0, 2", "1, 0", "2, 3", "3, 1"})
    void test(int start, int expected) {
        // given
        Ladder ladder = new Ladder(new StaticPointGenerator(), new Size(4, 2));

        // when
        int result = ladder.play(start);

        // then
        assertThat(result).isEqualTo(expected);
    }
    
    static class StaticPointGenerator implements PointGenerator {
        
        private static final List<List<Boolean>> points = List.of(
                List.of(true, false, true, false),
                List.of(false, true, false, false)
        );
        
        private int i = 0;
        
        @Override
        public List<Boolean> generate(int size) {
            return points.get(i++);
        }
    }
}
