package ladder.io;

import ladder.Size;

public class StaticInputHandler implements InputHandler {

    @Override
    public Size inputSize() {
        return new Size(4, 4);
    }
}
