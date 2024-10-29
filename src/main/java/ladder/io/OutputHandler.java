package ladder.io;

import ladder.Ladder;
import ladder.Position;

import java.util.List;

public interface OutputHandler {

    void printLadder(Ladder ladder);

    void printResult(List<Position> positions);
}
