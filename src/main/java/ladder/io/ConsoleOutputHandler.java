package ladder.io;

import java.util.List;
import ladder.Ladder;
import ladder.Line;

public class ConsoleOutputHandler implements OutputHandler {

    @Override
    public void printLadder(Ladder ladder) {
        for (Line line : ladder.getLines()) {
            printLine(line.getPoints());
        }
    }

    private void printLine(List<Boolean> points) {
        printFirstVerticalLine();
        for (Boolean point : points) {
            printHorizontalLine(point);
        }
        alignNewLine();
    }

    private void printFirstVerticalLine() {
        System.out.print("|");
    }

    private void printHorizontalLine(Boolean point) {
        if (point) {
            System.out.print("-----|");
            return;
        }
        System.out.print("     |");
    }

    private static void alignNewLine() {
        System.out.println();
    }
}
