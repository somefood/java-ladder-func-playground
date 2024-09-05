package ladder;

import ladder.io.ConsoleOutputHandler;
import ladder.io.InputHandler;
import ladder.io.OutputHandler;
import ladder.io.StaticInputHandler;

public class LadderGameApplication {
    public static void main(String[] args) {
        InputHandler inputHandler = new StaticInputHandler();
        OutputHandler outputHandler = new ConsoleOutputHandler();

        Ladder ladder = new Ladder(inputHandler.inputSize());
        outputHandler.printLadder(ladder);
    }
}
