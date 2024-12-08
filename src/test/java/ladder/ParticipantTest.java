package ladder;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParticipantTest {


    @ParameterizedTest
    @ValueSource(strings = {"s", "se", "seo", "seok", "seokj"})
    @DisplayName("다섯 글자 이하 참가자 이름 생성 테스트")
    void normalNameTest(String name) {
        assertDoesNotThrow(() -> new Participant(name, new Position(0)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"seokju", "seokjuh", "seokjho", "seokjhon", "seokjhong"})
    @DisplayName("다섯 글자 초과 참가자 이름 생성 테스트")
    void abnormalNameTest(String name) {
        assertThatThrownBy(() -> new Participant(name, new Position(0)))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("참여자 이름은 5자 이하여야 합니다.");
    }
}
