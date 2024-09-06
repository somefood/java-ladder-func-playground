package ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lines {

    private final List<Line> lines;

    private Lines(List<Line> lines) {
        this.lines = new ArrayList<>(lines);
    }

    public static Lines of(List<Line> lines) {
        return new Lines(lines);
    }

    public List<Line> getLines() {
        return Collections.unmodifiableList(lines);
    }
}
