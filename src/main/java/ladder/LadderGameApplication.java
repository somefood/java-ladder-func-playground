package ladder;

import ladder.generator.RandomPointGenerator;
import ladder.io.ConsoleInputHandler;
import ladder.io.ConsoleOutputHandler;
import ladder.io.InputHandler;
import ladder.io.OutputHandler;

public class LadderGameApplication {
    public static void main(String[] args) {
        final InputHandler inputHandler = new ConsoleInputHandler();
        final OutputHandler outputHandler = new ConsoleOutputHandler();

        final Participants participants = inputHandler.inputParticipants();
        final GameResults gameResults = inputHandler.inputResults();

        final int width = participants.size();
        final Size size = inputHandler.inputSize(width);
        final Ladder ladder = new Ladder(new RandomPointGenerator(), size);

        outputHandler.printLadder(ladder, participants, gameResults);

        final String participantName = inputHandler.getParticipantName();
        final Participants findParticipants = participants.findAllByName(participantName);

        findParticipants.move(ladder);
        outputHandler.printResult(findParticipants, gameResults);
    }
}
