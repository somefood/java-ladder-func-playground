package ladder.io;

import ladder.Ladder;
import ladder.Position;

import java.util.List;
import ladder.Positions;

public interface OutputHandler {

    void printLadder(Ladder ladder);

    void printResult(Positions positions);
}
