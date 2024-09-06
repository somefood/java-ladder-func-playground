package ladder.io;

import java.util.List;
import ladder.Ladder;
import ladder.Line;
import ladder.Lines;
import ladder.Points;

public class ConsoleOutputHandler implements OutputHandler {

    @Override
    public void printLadder(Ladder ladder) {
        final Lines lines = ladder.getLines();
        for (Line line : lines.getLines()) {
            printLine(line.getPoints());
        }
    }

    private void printLine(Points points) {
        printFirstVerticalLine();
        for (Boolean point : points.getPoints()) {
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
