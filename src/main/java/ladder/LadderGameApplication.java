package ladder;

import ladder.generator.RandomPointGenerator;
import ladder.io.ConsoleInputHandler;
import ladder.io.ConsoleOutputHandler;
import ladder.io.InputHandler;
import ladder.io.OutputHandler;

public class LadderGameApplication {
    public static void main(String[] args) {
        InputHandler inputHandler = new ConsoleInputHandler();
        OutputHandler outputHandler = new ConsoleOutputHandler();

        Ladder ladder = new Ladder(new RandomPointGenerator(), inputHandler.inputSize());
        outputHandler.printLadder(ladder);
    }
}
