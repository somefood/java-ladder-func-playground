package ladder;

import java.util.ArrayList;
import java.util.List;
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

//        List<Player> players = new ArrayList<>();
//        List<Position> positions = new ArrayList<>();
//        for (int i = 0; i < size.getWidth(); i++) {
//            positions.add(new Position(i));
//        }
//
//        for (Position position : positions) {
//            ladder.play(position.getCurrentIndex());
//        }
//
//        System.out.println(positions);
    }
}
