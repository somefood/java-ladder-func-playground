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

        final Size size = inputHandler.inputSize();
        Ladder ladder = new Ladder(new RandomPointGenerator(), size);

        outputHandler.printLadder(ladder);

        Positions positions = Positions.initWith(size.getWidth());
        positions.move(ladder);

        outputHandler.printResult(positions);
    }
}
