package ladder.io;

import ladder.*;

import java.util.List;

public class ConsoleOutputHandler implements OutputHandler {

    @Override
    public void printLadder(Ladder ladder) {
        final List<Line> lines = ladder.getLines();
        for (Line line : lines) {
            printLine(line.getPoints());
        }
    }

    @Override
    public void printResult(List<Position> positions) {
        System.out.println();
        for (Position position : positions) {
            System.out.println(position.getStartIndex() + " -> " + position.getCurrentIndex());
        }
    }

    private void printLine(List<Boolean> points) {
        for (Boolean point : points) {
            printHorizontalLine(point);
        }
        alignNewLine();
    }

    private void printHorizontalLine(Boolean point) {
        if (point) {
            System.out.print("|-----");
            return;
        }
        System.out.print("|     ");
    }

    private static void alignNewLine() {
        System.out.println();
    }
}
