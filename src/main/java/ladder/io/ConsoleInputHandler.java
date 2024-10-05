package ladder.io;

import java.util.Scanner;
import ladder.Size;

public class ConsoleInputHandler implements InputHandler {

    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public Size inputSize() {
        final int width = inputWidth();
        final int height = inputHeight();

        return new Size(width, height);
    }

    private static int inputWidth() {
        System.out.println("사다리의 넓이는 몇 개 인가요?");
        return SCANNER.nextInt();
    }

    private static int inputHeight() {
        System.out.println("사다리의 높이는 몇 개 인가요?");
        return SCANNER.nextInt();
    }
}
